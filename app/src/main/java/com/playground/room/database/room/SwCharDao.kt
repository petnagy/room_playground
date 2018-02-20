package com.playground.room.database.room

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Query
import com.playground.room.database.Database
import com.playground.room.dataset.StarWarsCharEntitiy
import com.playground.room.dataset.SwChar

/**
 * Created by petnagy on 2018. 02. 19..
 */
@Dao
interface SwCharDao {

    @Query("SELECT * FROM " + Database.TABLE_SW_CHARS)
    fun getAllChar(): List<StarWarsCharEntitiy>

    @Query("SELECT * FROM " + Database.TABLE_SW_CHARS + " WHERE " + SwChar.SIDE + " =:side")
    fun getCharsFromOneSide(side: Int): List<StarWarsCharEntitiy>

}