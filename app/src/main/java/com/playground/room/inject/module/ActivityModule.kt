package com.playground.room.inject.module

import com.playground.room.inject.PerActivity
import com.playground.room.pages.main.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by petnagy on 2018. 01. 25..
 */
@Module
interface ActivityModule {

    @PerActivity
    @ContributesAndroidInjector(modules = arrayOf(MainActivityModule::class))
    fun contributeMainActivity() : MainActivity

}