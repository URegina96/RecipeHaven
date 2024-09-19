package com.example.recipehaven.data.remote

import retrofit2.http.GET
import retrofit2.http.Query

interface RecipeApi {
    @GET("api/json/v1/1/search.php")
    suspend fun getRecipes(@Query("s") query: String): RecipeResponse
}
