package com.alejandro_dev_links.disenioslogin.presentation.navigation.screen.auth

sealed class AuthScreen(val route: String) {
    object Login1 : AuthScreen("login1_screen")
    object Register1 : AuthScreen("register1_screen")
}