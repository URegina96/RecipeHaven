package com.example.recipehaven.di

import com.example.recipehaven.data.remote.RecipeApi
import com.example.recipehaven.data.repository.RecipeRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
object RepositoryModule {

    @Provides
    fun provideRecipeRepository(api: RecipeApi): RecipeRepository {
        return RecipeRepository(api)
    }
}
