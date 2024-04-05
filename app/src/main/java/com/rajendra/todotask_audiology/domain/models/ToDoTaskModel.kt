package com.rajendra.todotask_audiology.domain.models

data class ToDoTaskModel(
    val id: Int,
    val title: String,
    val description: String,
    val priority: Int
) {
    companion object {
        val EmptyModel = ToDoTaskModel(
            -1,
            "",
            "",
            Priority.LOW.ordinal
        )
    }
}
