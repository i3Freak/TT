package com.example.vpbankupdate.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

val Typography = Typography(
    bodyLarge = TextStyle( // ✅ Use 'bodyLarge' instead of 'body1'
        fontSize = 16.sp,
        fontWeight = FontWeight.Normal
    )
)
