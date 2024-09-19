package com.example.recipehaven

import RecipeAppNavHost
import RecipeAppTheme
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.rememberNavController
import androidx.work.PeriodicWorkRequestBuilder
import androidx.work.WorkManager
import androidx.work.WorkRequest
import com.example.recipehaven.data.worker.RecipeSyncWorker
import dagger.hilt.android.AndroidEntryPoint
import java.util.concurrent.TimeUnit

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            RecipeAppTheme {
                val navController = rememberNavController()
                RecipeAppNavHost(navController = navController, viewModel = hiltViewModel())
            }
        }

        val syncRequest: WorkRequest = PeriodicWorkRequestBuilder<RecipeSyncWorker>(1, TimeUnit.HOURS)
            .build()

        WorkManager.getInstance(this).enqueue(syncRequest)
    }
}