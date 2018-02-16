package com.playground.room.pages.oldsqlite.viewmodel

import android.databinding.BaseObservable
import android.view.View
import com.playground.room.common.recyclerview.ListItemViewModel
import com.playground.room.pages.oldsqlite.model.OldSqliteModel

/**
 * Created by petnagy on 2018. 01. 27..
 */
class OldSqliteViewModel(private val model: OldSqliteModel) : BaseObservable() {

    var chars: MutableList<ListItemViewModel> = mutableListOf()

    fun onShowAllClicked(view: View) {
        chars = model.getAllChars().map { it -> CharCardViewModel(it) }.toMutableList()
        notifyChange()
    }

    fun onEpireClicked(view: View) {

    }

    fun onRebelesClicked(view: View) {

    }
}