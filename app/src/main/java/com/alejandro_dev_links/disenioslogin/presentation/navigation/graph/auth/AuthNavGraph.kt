package com.alejandro_dev_links.disenioslogin.presentation.navigation.graph.auth

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.alejandro_dev_links.disenioslogin.presentation.navigation.Graph
import com.alejandro_dev_links.disenioslogin.presentation.navigation.screen.auth.AuthScreen
import com.alejandro_dev_links.disenioslogin.presentation.screens.login.loginuno.screenloginuno.screen.LoginScreen
import com.alejandro_dev_links.disenioslogin.presentation.screens.login.loginuno.screenregisterloginuno.screen.RegisterScreen

fun NavGraphBuilder.AuthNavGraph(navController: NavHostController) {
    navigation(
        route = Graph.AUTH1,
        startDestination = AuthScreen.Login1.route
    ) {
        composable(route = AuthScreen.Login1.route) {
            LoginScreen(navController = navController)
        }
        composable(route =AuthScreen.Register1.route ){
            RegisterScreen(navController = navController)
        }
    }
}