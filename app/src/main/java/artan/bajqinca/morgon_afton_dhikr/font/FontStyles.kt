package artan.bajqinca.morgon_afton_dhikr.font

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import artan.bajqinca.morgon_afton_dhikr.R

val AvenirFontFamily = FontFamily(
    Font(R.font.avenir_bold, FontWeight.Bold),
    Font(R.font.avenir_demi, FontWeight.W600),
    Font(R.font.avenir_regular, FontWeight.Normal),
    Font(R.font.avenir_light, FontWeight.Light),
    Font(R.font.avenir_ultra_light, FontWeight.ExtraLight),
)

val LoraFont = FontFamily(
    Font(R.font.lora_bold)
)

val MeQuranFont = FontFamily(
    Font(R.font.me_quran)
)

val NotoSansArabicFont = FontFamily(
    Font(R.font.noto_sans_arabic_extra_bold),
)

val AvenirTypography = Typography(
    titleSmall = TextStyle(
        fontFamily = AvenirFontFamily,
        fontWeight = FontWeight.W600,
        fontSize = 14.sp,
    ),
    titleMedium = TextStyle(
        fontFamily = AvenirFontFamily,
        fontSize = 19.sp,
        fontWeight = FontWeight.W600,
        lineHeight = 25.sp,
    ),
    titleLarge = TextStyle(
        fontFamily = AvenirFontFamily,
        fontSize = 30.sp,
    ),
    displaySmall = TextStyle(
        fontFamily = AvenirFontFamily,
        fontSize = 20.sp,
    ),
    displayMedium = TextStyle(
        fontFamily = AvenirFontFamily,
        fontSize = 20.sp,
    ),
    displayLarge = TextStyle(
        fontFamily = AvenirFontFamily,
        fontSize = 40.sp,
    ),
    bodySmall = TextStyle(
        fontFamily = AvenirFontFamily,
        fontSize = 12.sp,
    ),
    bodyMedium = TextStyle(
        fontFamily = AvenirFontFamily,
        fontSize = 16.sp,
    ),
    bodyLarge = TextStyle(
        fontFamily = AvenirFontFamily,
        fontSize = 20.sp,
    ),
)

val MeQuranTypography = Typography(
    titleSmall = TextStyle(
        fontFamily = MeQuranFont,
        fontWeight = FontWeight.W600,
        fontSize = 16.sp,
        letterSpacing = 5.sp,
    ),
    titleMedium = TextStyle(
        fontFamily = MeQuranFont,
        fontSize = 27.sp,
        lineHeight = 45.sp,
        letterSpacing = 5.sp,
    ),
    titleLarge = TextStyle(
        fontFamily = MeQuranFont,
        fontSize = 30.sp,
    ),
    displaySmall = TextStyle(
        fontFamily = MeQuranFont,
        fontSize = 20.sp,
    ),
    displayMedium = TextStyle(
        fontFamily = MeQuranFont,
        fontSize = 20.sp,
    ),
    displayLarge = TextStyle(
        fontFamily = MeQuranFont,
        fontSize = 40.sp,
    ),
    bodySmall = TextStyle(
        fontFamily = MeQuranFont,
        fontSize = 12.sp,
    ),
    bodyMedium = TextStyle(
        fontFamily = MeQuranFont,
        fontSize = 16.sp,
    ),
    bodyLarge = TextStyle(
        fontFamily = MeQuranFont,
        fontSize = 20.sp,
    ),
)
