package com.rajendra.todotask_audiology.presentation.navigation

import androidx.navigation.NavHostController
import com.rajendra.todotask_audiology.util.Action
import com.rajendra.todotask_audiology.util.Constants.LIST_SCREEN

class Screens (navController: NavHostController) {
    val list: (Action) -> Unit = {action ->
        navController.navigate("list/${action.name}") {
            popUpTo(LIST_SCREEN) {inclusive = true}
        }
    }

    val task: (Int) -> Unit = { id ->
        navController.navigate("task/$id")
    }

}