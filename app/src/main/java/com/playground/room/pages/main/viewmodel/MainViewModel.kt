package com.playground.room.pages.main.viewmodel

import android.view.View
import timber.log.Timber

/**
 * Created by petnagy on 2018. 01. 25..
 */
class MainViewModel {

    fun onOldSqliteClicked(view : View) {
        Timber.d("Old SQlite button clicked")
    }

    fun onRoomClicked(view : View) {
        Timber.d("Room button clicked")
    }
}