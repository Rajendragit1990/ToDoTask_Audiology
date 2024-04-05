package com.rajendra.todotask_audiology.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.rajendra.todotask_audiology.domain.models.Priority
import com.rajendra.todotask_audiology.util.Constants.DATABASE_TABLE

@Entity(tableName = DATABASE_TABLE)
data class ToDoTaskEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val description: String,
    val priority: Int
)
