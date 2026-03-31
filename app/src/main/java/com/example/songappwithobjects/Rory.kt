package com.example.songappwithobjects

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun Rory(navController: NavController) {

    LazyColumn() {
        item {
            Spacer(modifier = Modifier.size(100.dp))
        }
        item {
            Button(onClick = {
                navController.navigate("Home")
            }) {
                Text(text = "Click here for Home Screen ")

            }


        }
    }

}