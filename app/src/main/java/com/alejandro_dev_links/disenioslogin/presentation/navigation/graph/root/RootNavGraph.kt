package com.alejandro_dev_links.disenioslogin.presentation.navigation.graph.root

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.alejandro_dev_links.disenioslogin.presentation.navigation.Graph
import com.alejandro_dev_links.disenioslogin.presentation.navigation.graph.auth.AuthNavGraph

//Agregar la dependencia implementation ("androidx.navigation:navigation-compose:2.7.6")
@Composable
fun RootNavGraph(navController: NavHostController) {

    NavHost(
        navController = navController,
        route = Graph.ROOT,
        startDestination = Graph.AUTH1

    ) {
        AuthNavGraph(navController = navController)

    }
}