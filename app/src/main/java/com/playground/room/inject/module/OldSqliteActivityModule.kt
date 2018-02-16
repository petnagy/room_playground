package com.playground.room.inject.module

import android.database.sqlite.SQLiteDatabase
import com.playground.room.database.SqliteDatabaseHandler
import com.playground.room.inject.PerActivity
import com.playground.room.pages.oldsqlite.model.OldSqliteModel
import com.playground.room.pages.oldsqlite.viewmodel.OldSqliteViewModel
import dagger.Module
import dagger.Provides

/**
 * Created by petnagy on 2018. 01. 27..
 */
@Module
class OldSqliteActivityModule {

    @PerActivity
    @Provides
    fun provideOldSqliteViewModel(oldSqliteModel: OldSqliteModel): OldSqliteViewModel = OldSqliteViewModel(oldSqliteModel)

    @PerActivity
    @Provides
    fun provideOldSqliteModel(database: SQLiteDatabase): OldSqliteModel = OldSqliteModel(database)

    @PerActivity
    @Provides
    fun provideSqliteDatabase(databaseHandler: SqliteDatabaseHandler): SQLiteDatabase = databaseHandler.readableDatabase
}