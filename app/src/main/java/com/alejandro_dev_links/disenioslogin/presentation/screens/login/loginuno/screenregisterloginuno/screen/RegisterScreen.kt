package com.alejandro_dev_links.disenioslogin.presentation.screens.login.loginuno.screenregisterloginuno.screen

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.alejandro_dev_links.disenioslogin.presentation.screens.login.loginuno.screenregisterloginuno.compnents.RegisterContent

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegisterScreen(navController: NavHostController) {
    Scaffold {
        RegisterContent(navController = navController)
    }
}