package com.example.madlevel5task2.repository

import android.content.Context
import androidx.lifecycle.LiveData
import com.example.madlevel5task2.dao.GameBacklogDao
import com.example.madlevel5task2.database.GameBacklogRoomDatabase
import com.example.madlevel5task2.model.GameBacklog
import kotlinx.coroutines.InternalCoroutinesApi

@InternalCoroutinesApi
class GameBacklogRepository(context: Context) {
    private val gameBacklogDao: GameBacklogDao

    init {
        val database = GameBacklogRoomDatabase.getDatabase(context)
        gameBacklogDao = database!!.gameBacklogDao()
    }

    fun getAllGameBacklogs(): LiveData<List<GameBacklog>> {
        return gameBacklogDao.getAllGameBacklogs()
    }

    suspend fun insertGameBacklog(gameBacklog: GameBacklog) {
        gameBacklogDao.insertGameBacklog(gameBacklog)
    }

    suspend fun deleteGameBacklog() {
        gameBacklogDao.deleteBacklog()
    }
}