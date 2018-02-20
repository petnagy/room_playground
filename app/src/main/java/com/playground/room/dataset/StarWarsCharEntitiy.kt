package com.playground.room.dataset

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import com.playground.room.database.Database

/**
 * Created by petnagy on 2018. 01. 26..
 */

data class StarWarsChar(var id: Long = -1, var name: String = "", var race: Int = Race.NONE.race, var side: Int = Side.NONE.side, var role: String = "")

@Entity(tableName = Database.TABLE_SW_CHARS)
data class StarWarsCharEntitiy(
        @PrimaryKey(autoGenerate = true) var id: Long = -1,
        var name: String = "",
        var race: Int = Race.NONE.race,
        var side: Int = Side.NONE.side,
        var role: String = "")

class SwChar {
    companion object {
        const val ID = "id"
        const val NAME = "name"
        const val RACE = "race"
        const val SIDE = "side"
        const val ROLE = "role"
    }
}