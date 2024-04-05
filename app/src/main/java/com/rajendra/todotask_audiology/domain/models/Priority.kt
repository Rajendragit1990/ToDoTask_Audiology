package com.rajendra.todotask_audiology.domain.models

import androidx.compose.ui.graphics.Color
import com.rajendra.todotask_audiology.ui.theme.HighPriorityColor
import com.rajendra.todotask_audiology.ui.theme.LowPriorityColor
import com.rajendra.todotask_audiology.ui.theme.MediumPriorityColor
import com.rajendra.todotask_audiology.ui.theme.NonePriorityColor

enum class Priority(val color: Color) {
    NONE(NonePriorityColor),
    LOW(LowPriorityColor),
    MEDIUM(MediumPriorityColor),
    HIGH(HighPriorityColor),
}

fun String.toEnumValue(): Priority {
    return when (this) {
        Priority.NONE.name -> {
            Priority.NONE
        }

        Priority.LOW.name -> {
            Priority.LOW
        }

        Priority.MEDIUM.name -> {
            Priority.MEDIUM
        }

        Priority.HIGH.name -> {
            Priority.HIGH
        }

        else -> {
            Priority.NONE
        }
    }
}