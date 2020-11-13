package com.example.madlevel5example2.repository

import android.content.Context
import androidx.lifecycle.LiveData
import com.example.madlevel5example2.dao.GameBacklogDao
import com.example.madlevel5example2.database.GameBacklogRoomDatabase
import com.example.madlevel5example2.model.GameBacklog

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