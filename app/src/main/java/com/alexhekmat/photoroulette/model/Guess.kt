package com.alexhekmat.photoroulette.model

/**
 * A player’s answer for a round.
 */
sealed class Guess {
    data class BasicGuess(
        val playerId: String,
        val guessedPlayerId: String,
        val isCorrect: Boolean
    ): Guess()
}