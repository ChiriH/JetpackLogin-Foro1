package com.example.jetpacklogin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.*
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jetpacklogin.ui.theme.JetpackLoginTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackLoginTheme {
                val navController = rememberNavController()

                NavHost(navController = navController, startDestination = "login") {
                    composable("login") {
                        LoginScreen(navController)
                    }
                    composable("welcome/{userName}") { backStackEntry ->
                        val userName = backStackEntry.arguments?.getString("userName") ?: ""
                        WelcomeScreen(navController, userName)
                    }
                }
            }
        }
    }
}
