package com.example.androidtest3.rickandmorty.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.androidtest3.rickandmorty.ui.screens.HomeCharacters

@Composable
fun AppNavHost() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "HMain"
    ) {
        composable(ScreenRoutes.Home.nameFlow) {
            HomeCharacters()
        }
    }
}