package com.example.mykotlinapplication.nav

sealed class Screen(val route: String) {
    object UpdateSelectionScreen : Screen("updateSelection")
    object UpdateTargetScreen : Screen("updateTarget")
    object VerificationScreen : Screen("verificationScreen")
}

