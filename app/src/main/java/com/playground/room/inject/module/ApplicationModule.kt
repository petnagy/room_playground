package com.playground.room.inject.module

import android.content.Context
import com.playground.room.App
import com.playground.room.inject.ApplicationContext
import dagger.Module
import dagger.Provides

/**
 * Created by petnagy on 2018. 01. 24..
 */
@Module
class ApplicationModule {

    @Provides
    @ApplicationContext
    internal fun provideContext(application: App): Context {
        return application.applicationContext
    }

}