package com.playground.room.pages.oldsqlite.viewmodel

import android.databinding.BaseObservable
import android.view.View
import com.playground.room.common.recyclerview.ListItemViewModel
import com.playground.room.pages.oldsqlite.model.WithRoomModel
import com.playground.room.pages.roomimpl.viewmodel.RoomCharCardViewModel

/**
 * Created by petnagy on 2018. 01. 27..
 */
class WithRoomViewModel(private val model: WithRoomModel) : BaseObservable() {

    var chars: MutableList<ListItemViewModel> = mutableListOf()

    fun onShowAllClicked(view: View) {
        chars = model.getAllChars().map { it -> RoomCharCardViewModel(it) }.toMutableList()
        notifyChange()
    }

    fun onEpireClicked(view: View) {
        chars = model.getEmpireChars().map { it -> RoomCharCardViewModel(it) }.toMutableList()
        notifyChange()
    }

    fun onRebelesClicked(view: View) {
        chars = model.getRebelChars().map { it -> RoomCharCardViewModel(it) }.toMutableList()
        notifyChange()
    }
}