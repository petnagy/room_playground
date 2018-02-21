package com.playground.room.inject.module

import android.arch.persistence.db.SupportSQLiteDatabase
import android.arch.persistence.room.Room
import android.arch.persistence.room.migration.Migration
import android.content.Context
import com.playground.room.App
import com.playground.room.database.Database
import com.playground.room.database.SqliteDatabaseHandler
import com.playground.room.database.room.AppDatabase
import com.playground.room.database.room.SwCharDao
import com.playground.room.dataset.SwChar
import com.playground.room.inject.ApplicationContext
import com.playground.room.preference.PreferenceService
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


/**
 * Created by petnagy on 2018. 01. 24..
 */
@Module
class ApplicationModule {

    @Provides
    @ApplicationContext
    internal fun provideContext(application: App): Context = application.applicationContext


    @Module
    companion object {

        @Singleton
        @Provides
        @JvmStatic
        internal fun provideSqliteHandler(@ApplicationContext context: Context, preferenceService: PreferenceService): SqliteDatabaseHandler = SqliteDatabaseHandler(context, preferenceService)

        @Singleton
        @Provides
        @JvmStatic
        internal fun provideAppDatabase(@ApplicationContext context: Context, migration: Migration): AppDatabase =
                Room.databaseBuilder(context.applicationContext, AppDatabase::class.java, Database.NAME)
                        .allowMainThreadQueries()
                        .addMigrations(migration)
                        .build()

        @Singleton
        @Provides
        @JvmStatic
        internal fun provideSwCharDao(database: AppDatabase): SwCharDao = database.swCharDao()

        @Singleton
        @Provides
        @JvmStatic
        internal fun providePreferenceService(@ApplicationContext context: Context): PreferenceService = PreferenceService(context)


        @Singleton
        @Provides
        @JvmStatic
        internal fun provideMigration_1_2(preferenceService: PreferenceService): Migration = object : Migration(1, 2) {
            override fun migrate(database: SupportSQLiteDatabase) {
                database.execSQL("DROP TABLE " + Database.TABLE_SW_CHARS)
                val createSwCharTable = "CREATE TABLE " + Database.TABLE_SW_CHARS +
                        "(" + SwChar.ID + " INTEGER PRIMARY KEY NOT NULL," +
                        SwChar.NAME + " TEXT NOT NULL, " +
                        SwChar.RACE + " INTEGER NOT NULL, " +
                        SwChar.SIDE + " INTEGER NOT NULL, " +
                        SwChar.ROLE + " TEXT NOT NULL" + ")"
                database.execSQL(createSwCharTable)
                SqliteDatabaseHandler.insertMainChars(database)
                preferenceService.saveDatabaseVersion(2)
            }

        }
    }

}