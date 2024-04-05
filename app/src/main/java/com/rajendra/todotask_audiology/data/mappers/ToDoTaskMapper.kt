package com.rajendra.todotask_audiology.data.mappers

import com.rajendra.todotask_audiology.data.entities.ToDoTaskEntity
import com.rajendra.todotask_audiology.domain.models.ToDoTaskModel

fun ToDoTaskEntity.toModel(): ToDoTaskModel {
    return ToDoTaskModel(
        id, title, description, priority
    )
}

fun ToDoTaskModel.toEntity(): ToDoTaskEntity {
    return ToDoTaskEntity(
        id, title, description, priority
    )
}