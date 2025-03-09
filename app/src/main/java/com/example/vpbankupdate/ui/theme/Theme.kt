package com.example.vpbankupdate.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColorPalette = lightColorScheme(
    primary = Color(0xFF00A65A), // VPBank green
    primaryContainer = Color(0xFF007D3A),
    secondary = Color(0xFF000000)
)

private val DarkColorPalette = darkColorScheme(
    primary = Color(0xFF00A65A),
    primaryContainer = Color(0xFF007D3A),
    secondary = Color(0xFFFFFFFF)
)

@Composable
fun VPBankUpdateTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colorScheme = colors, // ✅ Use colorScheme instead of colors
        typography = Typography, // Ensure Typography is defined
        shapes = Shapes, // Ensure Shapes is defined
        content = content
    )
}
