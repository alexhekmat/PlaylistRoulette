package com.alexhekmat.photoroulette.model

/**
 * Points earned by a player (either per‑round delta or running total).
 */
sealed class Score {
    data class BasicScore(
        val playerId: String,
        val points: Int
    ): Score()
}