package com.sscomposeshowcaseview

import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.LayoutCoordinates

@Stable
data class ShowcaseProperty(
    val index: Int,
    val coordinates: LayoutCoordinates,
    val title: String,
    val titleColor: Color = Color.White,
    val subTitle: String,
    val subTitleColor: Color = Color.White,
    val showCaseType: ShowcaseType = ShowcaseType.SIMPLE_ROUNDED,
    val blurOpacity: Float = 0.8f,
    val showcaseDelay: Long = 2000
)
