package com.github.thomasaqx

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun EquipeScreen(navController: NavController) {
    val equipe = listOf("Weverton Luis RM98730", "Thomas Abner RM550347")

    Column(modifier = Modifier.fillMaxSize().padding(32.dp)) {
        Text("EQUIPE", style = MaterialTheme.typography.headlineMedium)
        Spacer(Modifier.height(24.dp))

        LazyColumn {
            items(equipe) { nome ->
                Card(modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp)) {
                    Text(text = nome, modifier = Modifier.padding(16.dp))
                }
            }
        }

        Spacer(Modifier.height(32.dp))
        Button(onClick = { navController.popBackStack() }, modifier = Modifier.fillMaxWidth()) {
            Text("Voltar")
        }
    }
}