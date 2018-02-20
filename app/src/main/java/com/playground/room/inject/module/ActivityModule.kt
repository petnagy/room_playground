package com.playground.room.inject.module

import com.playground.room.inject.PerActivity
import com.playground.room.pages.main.MainActivity
import com.playground.room.pages.oldsqlite.OldSqliteActivity
import com.playground.room.pages.roomimpl.WithRoomActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by petnagy on 2018. 01. 25..
 */
@Module
interface ActivityModule {

    @PerActivity
    @ContributesAndroidInjector(modules = [(MainActivityModule::class)])
    fun contributeMainActivity() : MainActivity

    @PerActivity
    @ContributesAndroidInjector(modules = [(OldSqliteActivityModule::class)])
    fun contributeOldSqliteActivity() : OldSqliteActivity

    @PerActivity
    @ContributesAndroidInjector(modules = [(WithRoomActivityModule::class)])
    fun contributeWithRoomActivity(): WithRoomActivity
}