package com.mmunoz.notemark.core.presentation.designsystem

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.mmunoz.notemark.R

val spaceGrotesk = FontFamily(
    Font(
        R.font.space_grotesk_bold,
        weight = FontWeight.Bold
    ),
    Font(
        R.font.space_grotesk_medium,
        weight = FontWeight.Medium
    )
)

val inter = FontFamily(
    Font(
        R.font.inter_24pt_regular,
        weight = FontWeight.Normal
    ),
    Font(
        R.font.inter_24pt_medium,
        weight = FontWeight.Medium
    )
)


// Set of Material typography styles to start with
val Typography = Typography(
    //X-Large
    titleLarge = TextStyle(
        fontFamily = spaceGrotesk,
        fontWeight = FontWeight.Bold,
        fontSize = 36.sp,
        lineHeight = 40.sp
    ),
    //Large
    titleMedium = TextStyle(
        fontFamily = spaceGrotesk,
        fontWeight = FontWeight.Bold,
        fontSize = 32.sp,
        lineHeight = 36.sp
    ),
    titleSmall = TextStyle(
        fontFamily = spaceGrotesk,
        fontWeight = FontWeight.Medium,
        fontSize = 17.sp,
        lineHeight = 24.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = inter,
        fontWeight = FontWeight.Normal,
        fontSize = 17.sp,
        lineHeight = 24.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = inter,
        fontWeight = FontWeight.Medium,
        fontSize = 15.sp,
        lineHeight = 20.sp
    ),
    bodySmall = TextStyle(
        fontFamily = inter,
        fontWeight = FontWeight.Normal,
        fontSize = 15.sp,
        lineHeight = 20.sp
    )
)