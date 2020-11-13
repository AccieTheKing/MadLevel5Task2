package com.example.madlevel5task2.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.DayOfWeek
import java.time.Month
import java.time.Year

@Entity(tableName = "backlogTable")
class GameBacklog(
    @ColumnInfo(name = "title") var title: String,
    @ColumnInfo(name = "platform") var platform: String,
    @ColumnInfo(name = "day") var day: DayOfWeek,
    @ColumnInfo(name = "month") var month: Month,
    @ColumnInfo(name = "year") var year: Year,
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") var id: Long
)