package com.example.mykotlinapplication.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.mykotlinapplication.nav.Screen

@Composable
fun UpdateTargetScreen(navController: NavController) {
    var selectedOption by remember { mutableStateOf<String?>(null) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // Title
        Text(
            text = "Chọn đối tượng cập nhật",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        // Subtitle
        Text(
            text = "Vui lòng lựa chọn 1 trong 2 đối tượng dưới đây để cập nhật Giấy tờ tùy thân, Sinh trắc học",
            fontSize = 14.sp,
            color = Color.Gray
        )

        Spacer(modifier = Modifier.height(16.dp))

        val options = listOf(
            "Người Đại diện hợp pháp và những cá nhân liên quan của TKTT KHDN",
            "Chủ thể doanh nghiệp"
        )

        options.forEach { option ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .selectable(
                        selected = (option == selectedOption),
                        onClick = { selectedOption = option }
                    )
                    .padding(vertical = 12.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                RadioButton(
                    selected = (option == selectedOption),
                    onClick = { selectedOption = option }
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = option,
                    fontSize = 16.sp,
                    fontWeight = if (option == selectedOption) FontWeight.Bold else FontWeight.Normal
                )
            }
        }

        Spacer(modifier = Modifier.height(8.dp))

        // Note
        Text(
            text = "(Lưu ý: NB ĐHP đăng thổ là chủ thể vui lòng cập nhật thông tin tại luồng 1)",
            fontSize = 12.sp,
            color = Color.Gray
        )

        Spacer(modifier = Modifier.weight(1f))

        // Continue Button (Material 3)
        Button(
            onClick = { navController.navigate(Screen.VerificationScreen.route) },
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = if (selectedOption != null) Color(0xFF00A651) else Color(0xFFB0BEC5),
                contentColor = Color.White
            ),
            shape = RoundedCornerShape(8.dp),
            enabled = selectedOption != null
        ) {
            Text(text = "Tiếp tục", fontSize = 16.sp)
        }
    }
}
