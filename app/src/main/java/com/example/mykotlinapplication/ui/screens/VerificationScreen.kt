package com.example.mykotlinapplication.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun VerificationScreen(navController: NavController) {
    var gpkdNumber by remember { mutableStateOf("") }
    var isError by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(text = "Xác thực thông tin", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        Text(text = "Vui lòng nhập số giấy phép kinh doanh", color = Color.Gray)

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Số GPKD/ĐKKD *", fontWeight = FontWeight.Bold, color = Color.Black)

        OutlinedTextField(
            value = gpkdNumber,
            onValueChange = {
                gpkdNumber = it
                isError = it.toLongOrNull() ?: 0 < 1_000_000_000L // Less than 10 digits
            },
            modifier = Modifier.fillMaxWidth(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            isError = isError,
            singleLine = true
        )

        if (isError) {
            Text(
                text = "Số GPKD không đúng hoặc không tồn tại trên hệ thống. QK vui lòng kiểm tra lại!",
                color = Color.Red,
                fontSize = 14.sp
            )
        }

        Spacer(modifier = Modifier.weight(1f))

        Button(
            onClick = {
                if (!isError) {

                }
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = if (!isError) Color(0xFF00A651) else Color(0xFFB0BEC5),
                contentColor = Color.White
            ),
            enabled = !isError
        ) {
            Text("Tiếp tục")
        }
    }
}
