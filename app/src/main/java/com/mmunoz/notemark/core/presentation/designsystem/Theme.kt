package com.mmunoz.notemark.core.presentation.designsystem

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColorScheme = lightColorScheme(
    primary = primary,
    onPrimary = onPrimary,
    surface = surface,
    onSurface = onSurface,
    onSurfaceVariant = onSurfaceVar,
    error = error
)

@Composable
fun NoteMarkTheme(
    content: @Composable () -> Unit
) {

    MaterialTheme(
        colorScheme = LightColorScheme,
        typography = Typography,
        content = content
    )
}