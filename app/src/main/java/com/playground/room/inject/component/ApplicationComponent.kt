package com.playground.room.inject.component

import android.content.Context
import com.playground.room.App
import com.playground.room.database.SqliteDatabaseHandler
import com.playground.room.inject.ApplicationContext
import com.playground.room.inject.module.ApplicationModule
import com.playground.room.inject.module.ActivityModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * Created by petnagy on 2018. 01. 24..
 */
@Singleton
@Component(modules = arrayOf(AndroidSupportInjectionModule::class, ApplicationModule::class, ActivityModule::class))
interface ApplicationComponent : AndroidInjector<App> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<App>()

    @ApplicationContext
    fun context(): Context

    fun exposeSqliteHandler(): SqliteDatabaseHandler

}