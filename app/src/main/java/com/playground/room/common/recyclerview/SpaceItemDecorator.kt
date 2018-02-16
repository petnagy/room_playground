package com.playground.room.common.recyclerview

import android.graphics.Rect
import android.support.v7.widget.RecyclerView


/**
 * Created by Peter_Istvan_Nagy on 2018-02-16.
 */
class SpaceItemDecorator(private val space: Int) : RecyclerView.ItemDecoration() {

    override fun getItemOffsets(outRect: Rect, view: android.view.View, parent: RecyclerView, state: RecyclerView.State) {
        super.getItemOffsets(outRect, view, parent, state)

        outRect.top = space
        outRect.left = space
        outRect.right = space
        if (parent.getChildAdapterPosition(view) != parent.adapter.itemCount - 1) {
            outRect.bottom = space
        }
    }
}