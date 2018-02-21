package com.playground.room.preference

import android.content.Context

/**
 * Created by Peter_Istvan_Nagy on 2018-02-21.
 */
class PreferenceService(private var context: Context) {

    companion object {
        private const val PREFERENCE = "preference"
        private const val DATABASE_VERSION = "databaseVersion"
    }

    fun getDatabaseVersion(): Int = context.getSharedPreferences(PREFERENCE, Context.MODE_PRIVATE).getInt(DATABASE_VERSION, 1)

    fun saveDatabaseVersion(version: Int) {
        context.getSharedPreferences(PREFERENCE, Context.MODE_PRIVATE).edit().putInt(DATABASE_VERSION, version).apply()
    }

}