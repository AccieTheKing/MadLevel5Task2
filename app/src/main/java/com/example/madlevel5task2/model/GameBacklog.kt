package com.example.madlevel5task2.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "backlogTable")
class GameBacklog(
    @ColumnInfo(name = "title") var title: String,
    @ColumnInfo(name = "platform") var platform: String,
    @ColumnInfo(name = "day") var day: Date,
    @ColumnInfo(name = "month") var month: Date,
    @ColumnInfo(name = "year") var year: Date,
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") var id: Long? = null
)