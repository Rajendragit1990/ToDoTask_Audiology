package com.rajendra.todotask_audiology.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.rajendra.todotask_audiology.data.entities.ToDoTaskEntity

@Database(entities = [ToDoTaskEntity::class], version = 1, exportSchema = false)
abstract class ToDoDatabase: RoomDatabase() {
    abstract fun toDoDao(): ToDoDao
}