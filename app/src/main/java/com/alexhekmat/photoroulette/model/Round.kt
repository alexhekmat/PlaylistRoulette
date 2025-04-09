package com.alexhekmat.photoroulette.model

/**
 * Immutable snapshot of a single round.
 */
sealed class Round {
    data class BasicRound(
        val index: Int,
        val song: Song,
        val addedByPlayerId: String        // who actually added this track
    ): Round()
}