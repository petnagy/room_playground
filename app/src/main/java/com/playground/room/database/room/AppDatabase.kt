package com.playground.room.database.room

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.playground.room.dataset.StarWarsCharEntitiy

/**
 * Created by petnagy on 2018. 02. 19..
 */
@Database(entities = [(StarWarsCharEntitiy::class)], version = 2)
abstract class AppDatabase: RoomDatabase() {

    abstract fun swCharDao(): SwCharDao

}