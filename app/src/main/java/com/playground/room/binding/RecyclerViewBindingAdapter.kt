package com.playground.room.binding

import android.databinding.BindingAdapter
import android.support.annotation.LayoutRes
import android.support.v7.widget.RecyclerView
import com.playground.room.common.recyclerview.ListItemViewModel
import com.playground.room.common.recyclerview.RecyclerViewAdapter

/**
 * Created by petnagy on 2018-02-15.
 */
@BindingAdapter("source")
fun setupRecyclerViewSource(recyclerView: RecyclerView, source: List<ListItemViewModel>) {
    getAdapter(recyclerView).items = source.toMutableList()
}

@BindingAdapter("itemLayout")
fun setupRecyclerViewItemLayout(recyclerView: RecyclerView, @LayoutRes itemLayout: Int) {
    getAdapter(recyclerView).itemLayout = itemLayout
}

private fun getAdapter(recyclerView: RecyclerView): RecyclerViewAdapter {
    var adapter: RecyclerViewAdapter? = recyclerView.adapter as RecyclerViewAdapter
    if (adapter == null) {
        adapter = RecyclerViewAdapter()
        recyclerView.adapter = adapter
    }
    return adapter
}
