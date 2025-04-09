package com.alexhekmat.photoroulette.model

/**
 * Host‑selected parameters before the match starts.
 */
sealed class GameSettings {
    data class BasicGameSettings(
        val rounds: Int = 5,
        val playlistId: String,
        val isPrivate: Boolean = false,
        val vibrationEnabled: Boolean = true
    ): GameSettings()
}