package com.example.mykotlinapplication.nav

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.mykotlinapplication.ui.screens.UpdateSelectionScreen
import com.example.mykotlinapplication.ui.screens.UpdateTargetScreen
import com.example.mykotlinapplication.ui.screens.VerificationScreen

@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "updateSelection") {
        composable("updateSelection") { UpdateSelectionScreen(navController) }
        composable("updateTarget") { UpdateTargetScreen(navController) }
        composable("verificationScreen") { VerificationScreen(navController) }
    }
}
