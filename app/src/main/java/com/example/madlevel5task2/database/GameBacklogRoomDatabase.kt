package com.example.madlevel5task2.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.madlevel5task2.dao.GameBacklogDao
import com.example.madlevel5task2.model.GameBacklog
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.internal.synchronized

@Database(entities = [GameBacklog::class], version = 1, exportSchema = false)
abstract class GameBacklogRoomDatabase : RoomDatabase() {
    abstract fun gameBacklogDao(): GameBacklogDao

    companion object {
        private val DATABASE_NAME = "GAME_BACKLOG_DATABASE"

        @Volatile
        private var DATABASE_INSTANCE: GameBacklogRoomDatabase? = null

        @InternalCoroutinesApi
        fun getDatabase(context: Context): GameBacklogRoomDatabase? {
            if (DATABASE_INSTANCE == null) {
                synchronized(GameBacklogRoomDatabase::class.java) {
                    if (DATABASE_INSTANCE == null) {
                        DATABASE_INSTANCE = Room.databaseBuilder(
                            context.applicationContext,
                            GameBacklogRoomDatabase::class.java, DATABASE_NAME
                        ).build()
                    }
                }
            }
            return DATABASE_INSTANCE
        }
    }
}