package com.playground.room.pages.roomimpl

import android.content.Context
import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import com.playground.room.BR
import com.playground.room.R
import com.playground.room.databinding.ActivityWithRoomBinding
import com.playground.room.pages.oldsqlite.viewmodel.WithRoomViewModel
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

/**
 * Created by petnagy on 2018. 02. 19..
 */
class WithRoomActivity: DaggerAppCompatActivity() {

    @Inject
    internal lateinit var viewModel: WithRoomViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_with_room)

        val binding: ActivityWithRoomBinding = DataBindingUtil.setContentView(this, R.layout.activity_with_room)
        binding.setVariable(BR.viewModel, viewModel)
        binding.executePendingBindings()
    }

    companion object {
        fun launchActivity(context: Context) : Intent = Intent(context, WithRoomActivity::class.java)
    }

}