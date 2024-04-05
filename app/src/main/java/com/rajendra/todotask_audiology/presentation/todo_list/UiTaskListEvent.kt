package com.rajendra.todotask_audiology.presentation.todo_list

import com.rajendra.todotask_audiology.util.UiText

sealed class UiTaskListEvent {
    data class ShowSnackbar(val value: UiText, val showUndoAction: Boolean = false) :
        UiTaskListEvent()
}