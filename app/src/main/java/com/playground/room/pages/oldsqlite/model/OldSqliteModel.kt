package com.playground.room.pages.oldsqlite.model

import android.database.sqlite.SQLiteDatabase
import com.playground.room.database.Database
import com.playground.room.dataset.Side
import com.playground.room.dataset.StarWarsChar
import com.playground.room.dataset.SwChar

/**
 * Created by petnagy on 2018. 01. 27..
 */
class OldSqliteModel(val database: SQLiteDatabase) {

    fun getAllChars(): List<StarWarsChar> = getSqlQuery("SELECT * FROM " + Database.TABLE_SW_CHARS, null)

    fun getRebelChars(): List<StarWarsChar> = getSqlQuery("SELECT * FROM " + Database.TABLE_SW_CHARS + " WHERE " + SwChar.SIDE + " =?", arrayOf(Side.REBEL.side.toString()))

    fun getEmpireChars(): List<StarWarsChar> = getSqlQuery("SELECT * FROM " + Database.TABLE_SW_CHARS + " WHERE " + SwChar.SIDE + " =?", arrayOf(Side.EMPIRE.side.toString()))

    private fun getSqlQuery(sqlQuery: String, args: Array<String>?): List<StarWarsChar> {
        val allChars: MutableList<StarWarsChar> = arrayListOf()
        var cursor = database.rawQuery(sqlQuery, args)
        if (cursor.moveToFirst()) {
            do {
                var char = StarWarsChar()
                char.id = cursor.getLong(0)
                char.name = cursor.getString(1)
                char.race = cursor.getInt(2)
                char.side = cursor.getInt(3)
                char.role = cursor.getString(4)
                allChars.add(char)
            } while (cursor.moveToNext())
        }
        return allChars
    }
}