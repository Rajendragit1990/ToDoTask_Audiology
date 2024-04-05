package com.rajendra.todotask_audiology.presentation.todo_details

import com.rajendra.todotask_audiology.domain.models.ToDoTaskModel

data class TaskUIState(
    val loading: Boolean = false,
    val toDoTaskModel: ToDoTaskModel? = null,
    val error: Throwable? = null
)