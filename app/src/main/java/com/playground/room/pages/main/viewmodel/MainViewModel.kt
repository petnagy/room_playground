package com.playground.room.pages.main.viewmodel

import android.view.View
import com.playground.room.pages.main.MainActivityCallback
import timber.log.Timber

/**
 * Created by petnagy on 2018. 01. 25..
 */
class MainViewModel(val callback: MainActivityCallback) {
    
    fun onOldSqliteClicked(view : View) {
        Timber.d("Old SQlite button clicked")
        callback.onOldSqlButtonClicked()
    }

    fun onRoomClicked(view : View) {
        Timber.d("Room button clicked")
        callback.onWithRoomButtonClicked()
    }
}