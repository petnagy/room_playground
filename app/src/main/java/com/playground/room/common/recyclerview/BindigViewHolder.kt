package com.playground.room.common.recyclerview

import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView

/**
 * Created by petnagy on 2018. 01. 28..
 */
class BindigViewHolder: RecyclerView.ViewHolder {

    private val binding: ViewDataBinding

    constructor(binding: ViewDataBinding): super(binding.root) {
        this.binding = binding
    }

    fun getBinding(): ViewDataBinding {
        return binding
    }
}