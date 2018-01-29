package com.playground.room.inject.module

import com.playground.room.inject.PerActivity
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
    fun provideOldSqliteViewModel() : OldSqliteViewModel = OldSqliteViewModel()

}