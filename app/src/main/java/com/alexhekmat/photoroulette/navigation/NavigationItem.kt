package com.alexhekmat.photoroulette.navigation

enum class Screen {
    LOGIN,
    CREATE_ACCOUNT,
    FORGOT_PASSWORD,
    MAIN_MENU,
    SETTINGS,
    ENTER_GAME_PIN,
    SELECT_ROUNDS,
    GAME_LOBBY,
    SELECT_PLAYLIST,
    GAME,
    ROUND_RESULT,
    GAME_OVER,
    SPLASH
}

/**
 * A sealed class to protect navigation from the user within the AppNavHost.
 */
sealed class NavigationItem(val route: String) {
    object Login : NavigationItem(Screen.LOGIN.name.lowercase())
    object CreateAccount : NavigationItem(Screen.CREATE_ACCOUNT.name.lowercase())
    object ForgotPassword : NavigationItem(Screen.FORGOT_PASSWORD.name.lowercase())
    object MainMenu : NavigationItem(Screen.MAIN_MENU.name.lowercase())
    object Settings : NavigationItem(Screen.SETTINGS.name.lowercase())
    object EnterGamePin : NavigationItem(Screen.ENTER_GAME_PIN.name.lowercase())
    object SelectRounds : NavigationItem(Screen.SELECT_ROUNDS.name.lowercase())
    object GameLobby : NavigationItem(Screen.GAME_LOBBY.name.lowercase())
    object SelectPlaylist : NavigationItem(Screen.SELECT_PLAYLIST.name.lowercase())
    object Game : NavigationItem(Screen.GAME.name.lowercase())
    object RoundResult : NavigationItem(Screen.ROUND_RESULT.name.lowercase())
    object GameOver : NavigationItem(Screen.GAME_OVER.name.lowercase())
    object Splash : NavigationItem(Screen.SPLASH.name.lowercase())
}