package com.playground.room.pages.oldsqlite.viewmodel

import android.view.View
import com.playground.room.common.recyclerview.ListItemViewModel
import com.playground.room.pages.oldsqlite.model.OldSqliteModel

/**
 * Created by petnagy on 2018. 01. 27..
 */
class OldSqliteViewModel(private val model: OldSqliteModel) {

    var chars: MutableList<ListItemViewModel> = mutableListOf()

    fun onShowAllClicked(view: View) {
        var allChars = model.getAllChars()
    }

    fun onEpireClicked(view: View) {

    }

    fun onRebelesClicked(view: View) {

    }
}