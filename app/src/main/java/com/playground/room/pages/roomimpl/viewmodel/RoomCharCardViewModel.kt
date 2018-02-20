package com.playground.room.pages.roomimpl.viewmodel

import android.databinding.Bindable
import com.playground.room.common.recyclerview.ListItemViewModel
import com.playground.room.dataset.StarWarsCharEntitiy

/**
 * Created by Peter_Istvan_Nagy on 2018-02-16.
 */
class RoomCharCardViewModel(private val char: StarWarsCharEntitiy): ListItemViewModel() {

    override fun getViewType(): Int {
        return 12345
    }

    @Bindable
    fun getCharName(): String = char.name

    @Bindable
    fun getRole(): String = char.role
}