package com.playground.room.inject.module

import com.playground.room.inject.PerActivity
import com.playground.room.pages.main.MainActivity
import com.playground.room.pages.main.viewmodel.MainViewModel
import dagger.Module
import dagger.Provides

/**
 * Created by petnagy on 2018. 01. 25..
 */
@Module
class MainActivityModule {

    @PerActivity
    @Provides
    fun provideMainViewModel(activity: MainActivity) : MainViewModel {
        return MainViewModel(activity)
    }

}