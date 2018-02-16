package com.playground.room.pages.oldsqlite.viewmodel

import android.databinding.Bindable
import com.playground.room.common.recyclerview.ListItemViewModel
import com.playground.room.dataset.StarWarsChar

/**
 * Created by Peter_Istvan_Nagy on 2018-02-16.
 */
class CharCardViewModel(private val char: StarWarsChar): ListItemViewModel() {

    override fun getViewType(): Int {
        return 1234
    }

    @Bindable
    fun getCharName(): String = char.name

    @Bindable
    fun getRole(): String = char.role
}