import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

// Цвета для светлой темы
val LightBackground = Color(0xFFF9F9F9)
val LightSurface = Color(0xFFFFFFFF)
val LightPrimaryColor = Color(0xFF6200EE)
val LightSecondaryColor = Color(0xFF03DAC5)
val LightOnPrimaryColor = Color(0xFFFFFFFF)
val LightOnSecondaryColor = Color(0xFF000000)
val LightOnSurfaceColor = Color(0xFF000000)

// Цвета для темной темы
val DarkBackground = Color(0xFF121212)
val DarkSurface = Color(0xFF1E1E1E)
val DarkPrimaryColor = Color(0xFFBB86FC)
val DarkSecondaryColor = Color(0xFF03DAC5)
val DarkOnPrimaryColor = Color(0xFF000000)
val DarkOnSecondaryColor = Color(0xFF000000)
val DarkOnSurfaceColor = Color(0xFFFFFFFF)

private val DarkColorScheme = darkColorScheme(
    primary = DarkPrimaryColor,
    onPrimary = DarkOnPrimaryColor,
    secondary = DarkSecondaryColor,
    onSecondary = DarkOnSecondaryColor,
    background = DarkBackground,
    surface = DarkSurface,
    onSurface = DarkOnSurfaceColor
)

private val LightColorScheme = lightColorScheme(
    primary = LightPrimaryColor,
    onPrimary = LightOnPrimaryColor,
    secondary = LightSecondaryColor,
    onSecondary = LightOnSecondaryColor,
    background = LightBackground,
    surface = LightSurface,
    onSurface = LightOnSurfaceColor
)
