package com.alexhekmat.photoroulette.model

sealed class Player {
    data class BasicPlayer(
        val user: User,
        val score: Int = 0,
        val isHost: Boolean = false
    ): Player()
}