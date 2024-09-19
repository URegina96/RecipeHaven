package com.example.recipehaven.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.recipehaven.data.model.Recipe
import com.example.recipehaven.data.repository.RecipeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RecipeViewModel @Inject constructor(private val repository: RecipeRepository) : ViewModel() {
    private val _recipes = MutableLiveData<List<Recipe>>()
    val recipes: LiveData<List<Recipe>> = _recipes

    init {
        fetchRecipes("плов")
    }

    private fun fetchRecipes(name: String) {
        viewModelScope.launch {
            val listOfRecipes = repository.getRecipes(name)
            _recipes.value = listOfRecipes ?: emptyList()
        }
    }


    fun getRecipeById(id: String?): Recipe? {
        return _recipes.value?.find { it.id == id }
    }
}
