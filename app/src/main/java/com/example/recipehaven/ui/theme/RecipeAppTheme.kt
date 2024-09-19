import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.material.Shapes
import androidx.compose.material.Typography
import androidx.compose.runtime.Composable

@Composable
fun RecipeAppTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colors = lightColors(),
        typography = Typography(),
        shapes = Shapes(),
        content = content
    )
}