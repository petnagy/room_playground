package com.playground.room.dataset

/**
 * Created by petnagy on 2018. 01. 26..
 */

data class StarWarsChar(var id: Long, var name: String, var race: Int, var side: Int, var role: String)

class SwChar {
    companion object {
        val ID = "id"
        val NAME = "name"
        val RACE = "race"
        val SIDE = "side"
        val ROLE = "role"
    }
}