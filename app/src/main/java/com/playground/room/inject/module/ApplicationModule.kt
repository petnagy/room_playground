package com.playground.room.inject.module

import android.arch.persistence.room.Room
import android.content.Context
import com.playground.room.App
import com.playground.room.database.Database
import com.playground.room.database.SqliteDatabaseHandler
import com.playground.room.database.room.AppDatabase
import com.playground.room.database.room.SwCharDao
import com.playground.room.inject.ApplicationContext
import dagger.Module
import dagger.Provides
import javax.inject.Singleton
import android.arch.persistence.db.SupportSQLiteDatabase
import android.arch.persistence.room.migration.Migration
import com.playground.room.dataset.SwChar


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
        internal fun provideSqliteHandler(@ApplicationContext context: Context): SqliteDatabaseHandler = SqliteDatabaseHandler(context)

        @Singleton
        @Provides
        @JvmStatic
        internal fun provideAppDatabase(@ApplicationContext context: Context): AppDatabase =
                Room.databaseBuilder(context.applicationContext, AppDatabase::class.java, Database.NAME)
                        .allowMainThreadQueries()
                        .addMigrations(MIGRATION_1_2)
                        .build()

        @Singleton
        @Provides
        @JvmStatic
        internal fun provideSwCharDao(database: AppDatabase): SwCharDao = database.swCharDao()

        private val MIGRATION_1_2: Migration = object : Migration(1, 2) {
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
            }
        }
    }

}