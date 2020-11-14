package com.example.madlevel5task2.ui.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.madlevel5task2.model.GameBacklog
import com.example.madlevel5task2.repository.GameBacklogRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.util.*

class GameBacklogViewModel(application: Application) : AndroidViewModel(application) {
    private val mainScope = CoroutineScope(Dispatchers.Main)
    private val gameBacklogRepository = GameBacklogRepository(application.applicationContext)

    val gameBacklogs: LiveData<List<GameBacklog>> = gameBacklogRepository.getAllGameBacklogs()
    val error = MutableLiveData<String>()
    val success = MutableLiveData<Boolean>()

    fun insertGameBackLog(
        title: String,
        platform: String,
        releaseDate: Date
    ) {
        val gameBacklog = GameBacklog(
            title = title,
            platform = platform,
            releaseDate = releaseDate
        )

        if (isValidGameBacklog(gameBacklog)) {
            mainScope.launch {
                withContext(Dispatchers.IO) {
                    gameBacklogRepository.insertGameBacklog(gameBacklog)
                }
                success.value = true
            }
        }
    }

    fun deleteGameBacklog() {
        mainScope.launch {
            withContext(Dispatchers.IO) {
                gameBacklogRepository.deleteGameBacklog()
            }
            success.value = true
        }
    }

    private fun isValidGameBacklog(gameBacklog: GameBacklog): Boolean {
        return when {
            gameBacklog.title.isBlank() -> {
                error.value = "Title must not be empty!"
                false
            }
            gameBacklog.platform.isBlank() -> {
                error.value = "Platform must not be empty!"
                false
            }
            gameBacklog.releaseDate.toString().isBlank() -> {
                error.value = "Release date must not be empty!"
                false
            }
            else -> true
        }
    }
}