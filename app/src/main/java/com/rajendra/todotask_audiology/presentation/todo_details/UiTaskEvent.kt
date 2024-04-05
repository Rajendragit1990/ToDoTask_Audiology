package com.rajendra.todotask_audiology.presentation.todo_details

import com.rajendra.todotask_audiology.util.Action
import com.rajendra.todotask_audiology.util.UiText

sealed class UiTaskEvent {
    data class NavigateBackEvent(val action: Action) : UiTaskEvent()
    data class ShowSnackbar(val value: UiText) : UiTaskEvent()
}