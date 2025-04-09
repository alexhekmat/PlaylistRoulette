package com.alexhekmat.photoroulette.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "playlists")
data class PlaylistEntity(
    @PrimaryKey val id: String,
    val name: String,
    val imageUrl: String?,            // Could be nullable if we don't always have an image
    val tracksCount: Int,
    val ownerId: String,              // e.g. Firebase user ID or Spotify user ID
    val updatedAt: Long = System.currentTimeMillis()
)