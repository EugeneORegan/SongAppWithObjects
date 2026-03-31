package com.example.songappwithobjects

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.songappwithobjects.ui.theme.SongAppWithObjectsTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SongAppWithObjectsTheme {
                val navCont = rememberNavController() // 1. NavController to navigate

                // 2. NavHost to map routes
                NavHost(navController = navCont, startDestination = "Home", builder = {
                    composable(route = "Home")
                    {
                        Home(navController = navCont)
                    }
                    composable(route = "Rory")
                    {
                        Rory(navController = navCont)
                    }
                    composable(route = "Neurosis")
                    {
                        Neurosis(navController = navCont)
                    }
                }

                )
            }
        }
    }
}






