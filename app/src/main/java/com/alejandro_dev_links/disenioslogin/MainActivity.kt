package com.alejandro_dev_links.disenioslogin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.addCallback
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.alejandro_dev_links.disenioslogin.presentation.navigation.graph.root.RootNavGraph
import com.alejandro_dev_links.disenioslogin.ui.theme.DiseniosLoginTheme

class MainActivity : ComponentActivity() {
    //para hacer uso de RootNavGraph
    private lateinit var navController: NavHostController
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContent {
            DiseniosLoginTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    navController = rememberNavController()
                    RootNavGraph(navController = navController)
                }
            }
        }
    }
}