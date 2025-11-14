package com.github.thomasaqx

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun MenuScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(32.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("MENU", style = MaterialTheme.typography.headlineMedium)
        Spacer(Modifier.height(40.dp))

        Button(onClick = { navController.navigate("imc") }, modifier = Modifier.fillMaxWidth()) {
            Text("Calcule IMC")
        }
        Spacer(Modifier.height(16.dp))

        Button(onClick = { navController.navigate("equipe") }, modifier = Modifier.fillMaxWidth()) {
            Text("Equipe")
        }
        Spacer(Modifier.height(16.dp))

        OutlinedButton(
            onClick = { navController.navigate("login") },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Sair")
        }
    }
}