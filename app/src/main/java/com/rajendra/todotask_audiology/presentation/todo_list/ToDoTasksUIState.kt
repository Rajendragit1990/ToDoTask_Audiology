package com.rajendra.todotask_audiology.presentation.todo_list

import com.rajendra.todotask_audiology.domain.models.Priority
import com.rajendra.todotask_audiology.domain.models.ToDoTaskModel
import com.rajendra.todotask_audiology.util.SearchAppBarState

data class TasksUIState(
    val loading: Boolean = false,
    val tasks: List<ToDoTaskModel> = emptyList(),
    val sort: Priority = Priority.NONE,
    val searchAppBarText: String = "",
    val appBarState: SearchAppBarState = SearchAppBarState.CLOSED,
    val error: Throwable? = null
)
