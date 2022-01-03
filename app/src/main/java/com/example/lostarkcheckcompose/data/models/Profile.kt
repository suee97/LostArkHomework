package com.example.lostarkcheckcompose.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.lostarkcheckcompose.utils.Constants.TABLE_NAME

@Entity(tableName = TABLE_NAME)
data class Profile(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val name: String,
    val level: Int,
    val job: Job
)