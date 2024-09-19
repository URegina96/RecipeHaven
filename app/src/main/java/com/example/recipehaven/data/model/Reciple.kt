package com.example.recipehaven.data.model

data class Recipe(
    val id: String,
    val title: String,
    val description: String,
    val ingredients: List<String>,
    val instructions: String
)