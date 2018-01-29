package com.playground.room.database

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.playground.room.dataset.Race
import com.playground.room.dataset.Side
import com.playground.room.dataset.StarWarsChar
import com.playground.room.dataset.SwChar
import timber.log.Timber

/**
 * Created by petnagy on 2018. 01. 26..
 */
class SqliteDatabaseHandler(context: Context): SQLiteOpenHelper(context, Database.NAME, null, Database.VERSION) {

    override fun onCreate(sqLiteDatabase: SQLiteDatabase) {
        Timber.d("Database is created")
        val CREATE_SW_CHAR_TABLE = "CREATE TABLE " + Database.TABLE_SW_CHARS +
                "(" + SwChar.ID + " INTEGER PRIMARY KEY," +
                SwChar.NAME + " TEXT, " +
                SwChar.RACE + " INTEGER, " +
                SwChar.SIDE + " INTEGER, " +
                SwChar.ROLE + " TEXT" + ")"
        sqLiteDatabase.execSQL(CREATE_SW_CHAR_TABLE)
        insertMainChars(sqLiteDatabase)
    }

    override fun onUpgrade(sqLiteDatabase: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + Database.TABLE_SW_CHARS)
        onCreate(sqLiteDatabase)
    }

    fun insertMainChars(sqLiteDatabase: SQLiteDatabase) {
        val LUKE_SKYWALKER = StarWarsChar(1, "Luke Skywalker", Race.HUMANOID.race, Side.REBEL.side, "Jedi")
        val LEIA = StarWarsChar(2, "Leia Organa", Race.HUMANOID.race, Side.REBEL.side, "general")
        val HAN_SOLO = StarWarsChar(3, "Han Solo", Race.HUMANOID.race, Side.REBEL.side, "smuggler")
        val CHEWBACCA = StarWarsChar(4, "Chewbacca", Race.WOOKIE.race, Side.REBEL.side, "co-pilot")
        val LANDO = StarWarsChar(5, "Lando Calrissian", Race.HUMANOID.race, Side.REBEL.side, "general")
        val R2D2 = StarWarsChar(6, "R2 D2", Race.DROID.race, Side.REBEL.side, "astro mechanic droid")
        val C3PO = StarWarsChar(7, "C3PO", Race.DROID.race, Side.REBEL.side, "protocol droid")
        val DART_VADER = StarWarsChar(8, "Dart Vader", Race.HUMANOID.race, Side.EMPIRE.side, "sith lord")
        val PALPATIN = StarWarsChar(9, "Palpatin", Race.HUMANOID.race, Side.EMPIRE.side, "emperor")
        val OBI_WAN = StarWarsChar(10, "Obi Wan Kenobi", Race.HUMANOID.race, Side.REBEL.side, "Jedi master")
        val BOBA_FETT = StarWarsChar(11, "Boba Fett", Race.HUMANOID.race, Side.EMPIRE.side, "head hunter")
        val JABBA = StarWarsChar(12, "Jabba", Race.HUT.race, Side.NEUTRAL.side, "gangster Boss")
        val TARKIN = StarWarsChar(13, "Wilhuff Tarkin", Race.HUMANOID.race, Side.EMPIRE.side, "Grand Moff")
        val MOTTI = StarWarsChar(14, "Conan Motti", Race.HUMANOID.race, Side.EMPIRE.side, "admiral")

        val insert1 = "INSERT INTO " + Database.TABLE_SW_CHARS + "(${LUKE_SKYWALKER.id}, ${LUKE_SKYWALKER.name}, ${LUKE_SKYWALKER.race}, ${LUKE_SKYWALKER.side}, ${LUKE_SKYWALKER.role})"
        val insert2 = "INSERT INTO " + Database.TABLE_SW_CHARS + "(${LEIA.id}, ${LEIA.name}, ${LEIA.race}, ${LEIA.side}, ${LEIA.role})"
        val insert3 = "INSERT INTO " + Database.TABLE_SW_CHARS + "(${HAN_SOLO.id}, ${HAN_SOLO.name}, ${HAN_SOLO.race}, ${HAN_SOLO.side}, ${HAN_SOLO.role})"
        val insert4 = "INSERT INTO " + Database.TABLE_SW_CHARS + "(${CHEWBACCA.id}, ${CHEWBACCA.name}, ${CHEWBACCA.race}, ${CHEWBACCA.side}, ${CHEWBACCA.role})"
        val insert5 = "INSERT INTO " + Database.TABLE_SW_CHARS + "(${LANDO.id}, ${LANDO.name}, ${LANDO.race}, ${LANDO.side}, ${LANDO.role})"
        val insert6 = "INSERT INTO " + Database.TABLE_SW_CHARS + "(${R2D2.id}, ${R2D2.name}, ${R2D2.race}, ${R2D2.side}, ${R2D2.role})"
        val insert7 = "INSERT INTO " + Database.TABLE_SW_CHARS + "(${C3PO.id}, ${C3PO.name}, ${C3PO.race}, ${C3PO.side}, ${C3PO.role})"
        val insert8 = "INSERT INTO " + Database.TABLE_SW_CHARS + "(${DART_VADER.id}, ${DART_VADER.name}, ${DART_VADER.race}, ${DART_VADER.side}, ${DART_VADER.role})"
        val insert9 = "INSERT INTO " + Database.TABLE_SW_CHARS + "(${PALPATIN.id}, ${PALPATIN.name}, ${PALPATIN.race}, ${PALPATIN.side}, ${PALPATIN.role})"
        val insert10 = "INSERT INTO " + Database.TABLE_SW_CHARS + "(${OBI_WAN.id}, ${OBI_WAN.name}, ${OBI_WAN.race}, ${OBI_WAN.side}, ${OBI_WAN.role})"
        val insert11 = "INSERT INTO " + Database.TABLE_SW_CHARS + "(${BOBA_FETT.id}, ${BOBA_FETT.name}, ${BOBA_FETT.race}, ${BOBA_FETT.side}, ${BOBA_FETT.role})"
        val insert12 = "INSERT INTO " + Database.TABLE_SW_CHARS + "(${JABBA.id}, ${JABBA.name}, ${JABBA.race}, ${JABBA.side}, ${JABBA.role})"
        val insert13 = "INSERT INTO " + Database.TABLE_SW_CHARS + "(${TARKIN.id}, ${TARKIN.name}, ${TARKIN.race}, ${TARKIN.side}, ${TARKIN.role})"
        val insert14 = "INSERT INTO " + Database.TABLE_SW_CHARS + "(${MOTTI.id}, ${MOTTI.name}, ${MOTTI.race}, ${MOTTI.side}, ${MOTTI.role})"

        sqLiteDatabase.execSQL(insert1)
        sqLiteDatabase.execSQL(insert2)
        sqLiteDatabase.execSQL(insert3)
        sqLiteDatabase.execSQL(insert4)
        sqLiteDatabase.execSQL(insert5)
        sqLiteDatabase.execSQL(insert6)
        sqLiteDatabase.execSQL(insert7)
        sqLiteDatabase.execSQL(insert8)
        sqLiteDatabase.execSQL(insert9)
        sqLiteDatabase.execSQL(insert10)
        sqLiteDatabase.execSQL(insert11)
        sqLiteDatabase.execSQL(insert12)
        sqLiteDatabase.execSQL(insert13)
        sqLiteDatabase.execSQL(insert14)
    }
}