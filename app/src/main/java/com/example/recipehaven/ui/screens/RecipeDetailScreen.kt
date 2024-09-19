package com.example.recipehaven.ui.screens

import androidx.compose.material.MaterialTheme
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.recipehaven.data.model.Recipe

@Composable
fun RecipeDetailScreen(recipe: Recipe?) {
    if (recipe == null) {
        Text("Рецепт не найден")
        return
    }
    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = recipe.title, style = MaterialTheme.typography.h4)
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "Ингредиенты:", style = MaterialTheme.typography.h6)
        recipe.ingredients.forEach { ingredient ->
            Text(text = "- $ingredient")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "Инструкции:", style = MaterialTheme.typography.h6)
        Text(text = recipe.instructions)
    }
}
