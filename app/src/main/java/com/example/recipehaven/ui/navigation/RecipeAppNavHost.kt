import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.recipehaven.ui.screens.RecipeDetailScreen
import com.example.recipehaven.ui.screens.RecipeListScreen
import com.example.recipehaven.viewmodel.RecipeViewModel

@Composable
fun RecipeAppNavHost(navController: NavHostController, viewModel: RecipeViewModel) {
    NavHost(navController, startDestination = "recipe_list") {
        composable("recipe_list") {
            RecipeListScreen(viewModel = viewModel, navController = navController)
        }
        composable("recipe_detail/{recipeId}") { backStackEntry ->
            val recipeId = backStackEntry.arguments?.getString("recipeId")
            val recipe = recipeId?.let { viewModel.getRecipeById(it) }
            recipe?.let { RecipeDetailScreen(recipe = it) }
        }
    }
}