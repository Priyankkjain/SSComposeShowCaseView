package com.sscomposeshowcaseview

import androidx.compose.runtime.Immutable

/**
 * Select type of showcase
 */
@Immutable
enum class ShowcaseType {
    SIMPLE_ROUNDED,
    SIMPLE_RECTANGLE,
    ANIMATED_ROUNDED,
    ANIMATED_RECTANGLE
}
