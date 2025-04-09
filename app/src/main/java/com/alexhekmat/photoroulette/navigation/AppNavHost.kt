package com.alexhekmat.photoroulette.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.alexhekmat.photoroulette.screens.LoginScreen

/**
 * A Composable App Navigation Host for the application.
 */
@Composable
fun AppNavHost() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = NavigationItem.Login.route) {
        composable(NavigationItem.Login.route) {
            LoginScreen(
                onCreateAccountButton = {
                    navController.navigate(NavigationItem.CreateAccount.route)
                }
                onForgotPasswordButton = {
                    navController.navigate(NavigationItem.ForgotPassword.route)
                }
                onLoginSuccess = {
                    navController.navigate(NavigationItem.MainMenu.route)
                }
            )
        }
    }
}