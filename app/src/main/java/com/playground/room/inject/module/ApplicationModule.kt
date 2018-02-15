package com.playground.room.inject.module

import android.content.Context
import com.playground.room.App
import com.playground.room.database.SqliteDatabaseHandler
import com.playground.room.inject.ApplicationContext
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
        internal fun provideSqliteHandler(@ApplicationContext context: Context): SqliteDatabaseHandler = SqliteDatabaseHandler(context)
    }

}