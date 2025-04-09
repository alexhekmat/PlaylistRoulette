package com.alexhekmat.photoroulette.model

/**
 * App‑level identity Firestore UID, Spotify user, Or Custom
 */
sealed class User {
    data class BasicUser(
        val id: String,
        val username: String,
        val email: String? = null,
        val avatarUrl: String? = null
    ) : User()
}
