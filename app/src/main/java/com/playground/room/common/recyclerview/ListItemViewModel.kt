package com.playground.room.common.recyclerview

import android.databinding.BaseObservable

/**
 * Created by petnagy on 2018. 01. 28..
 */
abstract class ListItemViewModel: BaseObservable() {

    abstract fun getViewType(): Int

    fun areItemsTheSame(newItem: ListItemViewModel): Boolean {
        return this == newItem
    }

    fun areContentsTheSame(newItem: ListItemViewModel): Boolean {
        return this == newItem
    }
}