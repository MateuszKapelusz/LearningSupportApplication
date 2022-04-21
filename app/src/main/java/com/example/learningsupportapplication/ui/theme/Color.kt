package com.example.learningsupportapplication.ui.theme

import androidx.compose.material.Colors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)

val LightGray = Color(0xFFFCFCFC)
val ListItemGray = Color(0xFFEFEFEF)
val MediumGray = Color(0xFF9c9c9c)
val DarkGray = Color(0xFF141414)

val Colors.listItemColor: Color
    @Composable
    get() = if (isLight) ListItemGray else Color.Black

val Colors.textItemColor: Color
    @Composable
    get() = if (isLight) Color.Black else Color.White


val Colors.splashScreenBackground: Color
    @Composable
    get() = if (isLight) Purple700 else Color.Black

val Colors.topAppBarContentColor: Color
    @Composable
    get() = if (isLight) Color.White else LightGray

val Colors.bottomAppBarBackgroundColor: Color
    @Composable
    get() = if (isLight) Purple500 else Color.Black


val Colors.cardItemBackgroundColor: Color
    @Composable
    get() = if (isLight) Color.White else DarkGray

val Colors.taskItemTextColor: Color
    @Composable
    get() = if (isLight) DarkGray else LightGray
