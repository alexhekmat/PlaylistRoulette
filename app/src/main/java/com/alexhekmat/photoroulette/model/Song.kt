package com.alexhekmat.photoroulette.model

/**
 * Minimal song set up
 */
sealed class Song {
    data class BasicSong(
        val id: String,
        val title: String,
        val artist: String,
        val album: String? = null,
        val imageUrl: String? = null,
        val previewUrl: String? = null,   // 30‑sec clip to pre‑buffer
        val durationMs: Int? = null
    ): Song()
}