package com.example.recipehaven.data.worker

import android.content.Context
import androidx.work.CoroutineWorker
import androidx.work.Worker
import androidx.work.WorkerParameters
import com.example.recipehaven.data.repository.RecipeRepository
import javax.inject.Inject

class RecipeSyncWorker(
    context: Context,
    workerParams: WorkerParameters
) : Worker(context, workerParams) {
    override fun doWork(): Result {

        return Result.success()
    }
}

