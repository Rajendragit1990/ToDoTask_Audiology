package com.rajendra.todotask_audiology.presentation.todo_details.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Save
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.rajendra.todotask_audiology.R
import com.rajendra.todotask_audiology.ui.theme.ToDoTask_AudiologyTheme
import com.rajendra.todotask_audiology.util.TestTags

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppBarEmpty(
    onBackClicked: () -> Unit
) {
    TopAppBar(
        modifier = Modifier.testTag(TestTags.TaskDetailsScreen.TASK_DETAILS_APP_BAR),
        title = { Text(text = "") },
        colors = TopAppBarDefaults.mediumTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.primary,
            titleContentColor = MaterialTheme.colorScheme.onPrimary
        ),
        navigationIcon = {
            BackAction {
                onBackClicked()
            }
        }
    )
}
