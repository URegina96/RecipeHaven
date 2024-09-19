package com.example.recipehaven.data.repository

import com.example.recipehaven.data.model.Recipe
import com.example.recipehaven.data.remote.RecipeApi
import javax.inject.Inject

class RecipeRepository @Inject constructor(private val api: RecipeApi) {
    suspend fun getRecipes(name: String): List<Recipe>? {
        return try {
            val response = api.getRecipes(name)
            response.meals
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }
}
