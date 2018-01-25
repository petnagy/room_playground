package com.playground.room

import com.playground.room.inject.component.DaggerApplicationComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import timber.log.Timber

/**
 * Created by petnagy on 2018. 01. 24..
 */
class App : DaggerApplication() {

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerApplicationComponent.builder().create(this)
    }

}