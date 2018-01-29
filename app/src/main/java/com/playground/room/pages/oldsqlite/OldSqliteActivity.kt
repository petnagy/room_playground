package com.playground.room.pages.oldsqlite

import android.content.Context
import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import com.playground.room.BR
import com.playground.room.R
import com.playground.room.databinding.ActivityOldSqliteBinding
import com.playground.room.pages.oldsqlite.viewmodel.OldSqliteViewModel
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

/**
 * Created by petnagy on 2018. 01. 26..
 */

class OldSqliteActivity : DaggerAppCompatActivity() {

    @Inject
    internal lateinit var viewModel: OldSqliteViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_old_sqlite)

        val binding: ActivityOldSqliteBinding = DataBindingUtil.setContentView(this, R.layout.activity_old_sqlite)
        binding.setVariable(BR.viewModel, viewModel)
        binding.executePendingBindings()
    }

    companion object {
        fun launchActivity(context: Context) : Intent = Intent(context, OldSqliteActivity::class.java)
    }
}
