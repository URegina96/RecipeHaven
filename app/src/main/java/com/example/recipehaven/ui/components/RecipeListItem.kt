package com.example.recipehaven.ui.components

import androidx.compose.material.MaterialTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.clickable
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.recipehaven.data.model.Recipe

@Composable
fun RecipeListItem(recipe: Recipe, onClick: () -> Unit) {
    Card(modifier = Modifier
        .padding(8.dp)
        .clickable(onClick = onClick)) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = recipe.title ?: "Нет заголовка", style = MaterialTheme.typography.h6)
            Text(text = recipe.description ?: "Нет описания", style = MaterialTheme.typography.body2)
        }
    }
}
