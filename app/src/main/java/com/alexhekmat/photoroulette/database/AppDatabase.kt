package com.alexhekmat.photoroulette.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [PlaylistEntity::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun gameDao(): GameDao
    abstract fun playlistDao(): PlaylistDao
    abstract fun userDao(): UserDao
}