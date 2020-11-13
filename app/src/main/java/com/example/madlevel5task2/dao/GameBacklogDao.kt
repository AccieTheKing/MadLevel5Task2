package com.example.madlevel5task2.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.madlevel5task2.model.GameBacklog

@Dao
interface GameBacklogDao {
    @Insert
    suspend fun insertGameBacklog(gameBacklog: GameBacklog)

    @Query("SELECT * FROM backlogTable")
    fun getAllGameBacklogs(): LiveData<List<GameBacklog>>

    @Query("DELETE FROM backlogTable")
    suspend fun deleteBacklog()
}