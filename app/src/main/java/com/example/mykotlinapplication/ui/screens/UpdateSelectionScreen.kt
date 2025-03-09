package com.example.mykotlinapplication.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.mykotlinapplication.R
import com.example.mykotlinapplication.nav.Screen
import com.example.mykotlinapplication.ui.components.StepItem

@Composable
fun UpdateSelectionScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Spacer(modifier = Modifier.height(10.dp))

        Image(
            painter = painterResource(id = R.drawable.vpbank_logo), // Replace with your image
            contentDescription = "VPBank Logo",
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp),
            contentScale = ContentScale.Fit
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Xin chào Quý Khách!",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Hãy cùng VPBank cập nhật Giấy tờ tùy thân và Sinh trắc học nhanh chóng chỉ với 3 bước:",
            fontSize = 16.sp,
            color = Color.Gray
        )

        Spacer(modifier = Modifier.height(20.dp))

        StepItem(stepNumber = "1", text = "Cung cấp Đăng ký kinh doanh và CCCD gắn chip")
        StepItem(stepNumber = "2", text = "Xác nhận thông tin cập nhật")
        StepItem(stepNumber = "3", text = "Xác nhận hồ sơ cập nhật và Ký số doanh nghiệp")

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Quý khách vui lòng chuẩn bị:",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(10.dp))

        val preparationItems = listOf(
            "Bản gốc Giấy đăng ký kinh doanh",
            "Bản gốc Căn cước công dân gắn chip",
            "Điện thoại có hỗ trợ đọc thẻ chip trong Căn cước công dân"
        )

        preparationItems.forEach {
            Text(text = "• $it", fontSize = 14.sp, color = Color.Gray)
        }

        Spacer(modifier = Modifier.height(20.dp))

        Card(
            shape = RoundedCornerShape(8.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Nếu không đáp ứng đủ các điều kiện trên, quý khách vui lòng liên hệ hotline 1900 234 588 hoặc đến\n" +
                        "chi nhánh VPBank để được hỗ trợ.",
                fontSize = 14.sp,
                color = Color.Black,
                modifier = Modifier.padding(10.dp)
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = { navController.navigate(Screen.UpdateTargetScreen.route) },// Navigate to next screen
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF00A65A)),
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            shape = RoundedCornerShape(10.dp)
        )
        {
            Text(
                text = "Bắt đầu cập nhật",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
        }
    }
}
