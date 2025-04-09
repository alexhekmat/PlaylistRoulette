package com.alexhekmat.photoroulette.model

sealed class Game {
    /**
     * High‑level container for the whole match.
     */
    data class BasicGame(
        val id: String,                    // Firestore doc ID or backend UUID or store both
        val code: String,                  // 6‑digit join code
        val hostId: String,
        val settings: GameSettings,
        val players: List<Player> = emptyList(),
        val currentRound: Int = 0,         // 0‑based index
        val status: GameStatus = GameStatus.LOBBYING
    ): Game()
}