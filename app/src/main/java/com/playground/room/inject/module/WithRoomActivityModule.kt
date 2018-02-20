package com.playground.room.inject.module

import com.playground.room.database.room.SwCharDao
import com.playground.room.inject.PerActivity
import com.playground.room.pages.oldsqlite.model.WithRoomModel
import com.playground.room.pages.oldsqlite.viewmodel.WithRoomViewModel
import dagger.Module
import dagger.Provides

/**
 * Created by petnagy on 2018. 02. 19..
 */
@Module
class WithRoomActivityModule {

    @Provides
    @PerActivity
    fun provideWithRoomViewModel(model: WithRoomModel): WithRoomViewModel = WithRoomViewModel(model)

    @Provides
    @PerActivity
    fun provideWithRoomModel(dao: SwCharDao): WithRoomModel = WithRoomModel(dao)

}