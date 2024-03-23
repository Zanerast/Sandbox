package com.astrick.compose.theming.custom

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Immutable
data class CustomFont(
    val defaultFontFamily: FontFamily,
    val small: TextStyle,
    val medium: TextStyle,
    val large: TextStyle
)

val LocalCustomFont = staticCompositionLocalOf {
    CustomFont(
        defaultFontFamily = FontFamily.Default,
        small = TextStyle.Default,
        medium = TextStyle.Default,
        large = TextStyle.Default,
    )
}

private val defaultFontFamily = FontFamily.SansSerif
fun getCustomFonts(): CustomFont {
    return CustomFont(
        defaultFontFamily = FontFamily.SansSerif,
        small = TextStyle(
            fontFamily = defaultFontFamily,
            fontSize = 14.sp
        ),
        medium = TextStyle(
            fontFamily = defaultFontFamily,
            fontSize = 18.sp
        ),
        large = TextStyle(
            fontFamily = defaultFontFamily,
            fontSize = 22.sp,
            fontWeight = FontWeight.SemiBold
        ),
    )
}
