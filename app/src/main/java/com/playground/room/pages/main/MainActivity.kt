package com.playground.room.pages.main

import android.databinding.DataBindingUtil
import android.os.Bundle
import com.playground.room.BR
import com.playground.room.R
import com.playground.room.databinding.ActivityMainBinding
import com.playground.room.pages.main.viewmodel.MainViewModel
import com.playground.room.pages.oldsqlite.OldSqliteActivity
import com.playground.room.pages.roomimpl.WithRoomActivity
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity(), MainActivityCallback {

    @Inject
    internal lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.setVariable(BR.viewModel, viewModel)
        binding.executePendingBindings()
    }

    override fun onOldSqlButtonClicked() {
        val launchIntent = OldSqliteActivity.launchActivity(this)
        startActivity(launchIntent)
    }

    override fun onWithRoomButtonClicked() {
        val launchIntent = WithRoomActivity.launchActivity(this)
        startActivity(launchIntent)
    }
}
