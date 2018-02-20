package com.playground.room.pages.oldsqlite.model

import com.playground.room.database.room.SwCharDao
import com.playground.room.dataset.Side
import com.playground.room.dataset.StarWarsCharEntitiy

/**
 * Created by petnagy on 2018. 01. 27..
 */
class WithRoomModel(val dao: SwCharDao) {

    fun getAllChars(): List<StarWarsCharEntitiy> = dao.getAllChar()

    fun getRebelChars(): List<StarWarsCharEntitiy> = dao.getCharsFromOneSide(Side.REBEL.side)

    fun getEmpireChars(): List<StarWarsCharEntitiy> = dao.getCharsFromOneSide(Side.EMPIRE.side)
}