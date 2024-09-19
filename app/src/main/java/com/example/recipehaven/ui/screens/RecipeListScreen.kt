package com.example.recipehaven.ui.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.recipehaven.ui.components.RecipeListItem
import com.example.recipehaven.viewmodel.RecipeViewModel

@Composable
fun RecipeListScreen(viewModel: RecipeViewModel = viewModel(), navController: NavController) {
    val recipes by viewModel.recipes.observeAsState(emptyList())

    LazyColumn {
        items(recipes) { recipe ->
            RecipeListItem(recipe = recipe) {
                navController.navigate("recipe_detail/${recipe.id}")
            }
        }
    }
}
