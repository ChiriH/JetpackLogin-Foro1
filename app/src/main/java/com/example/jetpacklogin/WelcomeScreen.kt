package com.example.jetpacklogin

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun WelcomeScreen(navController: NavController, userName: String) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(32.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "¡Bienvenido, $userName!", style = MaterialTheme.typography.h4)
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Has iniciado sesión correctamente.")
    }
}
