package com.alejandro_dev_links.disenioslogin.presentation.screens.login.loginuno.screen

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import com.alejandro_dev_links.disenioslogin.presentation.screens.login.loginuno.components.LoginUnoContent

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen() {
    Scaffold {
        LoginUnoContent()
    }
}