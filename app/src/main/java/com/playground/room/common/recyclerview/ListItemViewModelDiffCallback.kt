package com.playground.room.common.recyclerview

import android.support.v7.util.DiffUtil

/**
 * Created by petnagy on 2018-02-16.
 */
class ListItemViewModelDiffCallback(private val oldItems: List<ListItemViewModel>, private val newItems: List<ListItemViewModel>) : DiffUtil.Callback() {

    override fun getOldListSize(): Int {
        return oldItems.size
    }

    override fun getNewListSize(): Int {
        return newItems.size
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldItems[oldItemPosition] == newItems[newItemPosition]
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldItems[oldItemPosition] == newItems[newItemPosition]
    }

}