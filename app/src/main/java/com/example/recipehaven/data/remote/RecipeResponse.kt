package com.example.recipehaven.data.remote

import com.example.recipehaven.data.model.Recipe

data class RecipeResponse(
    val meals: List<Recipe>?
)
