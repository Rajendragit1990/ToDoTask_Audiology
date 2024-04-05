package com.rajendra.todotask_audiology.presentation.todo_list.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rajendra.todotask_audiology.domain.models.Priority
import com.rajendra.todotask_audiology.domain.models.ToDoTaskModel
import com.rajendra.todotask_audiology.ui.theme.LARGE_PADDING
import com.rajendra.todotask_audiology.ui.theme.PRIORITY_INDICATOR_SIZE
import com.rajendra.todotask_audiology.ui.theme.ToDoTask_AudiologyTheme
import com.rajendra.todotask_audiology.util.TestTags

@Composable
fun ListTasks(
    tasks: List<ToDoTaskModel> = emptyList(),
    innerPadding: PaddingValues,
    listState: LazyListState,
    onTaskSelected: (ToDoTaskModel) -> Unit
) {
    LazyColumn(
        state = listState,
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
            .testTag(TestTags.ListScreen.TASKS_LIST),
    ) {
        items(items = tasks, key = { it.id }) { task ->
            TaskItem(
                toDoTaskModel = task,
                onTaskSelected = onTaskSelected
            )
        }
    }
}

@Composable
fun TaskItem(
    toDoTaskModel: ToDoTaskModel,
    onTaskSelected: (ToDoTaskModel) -> Unit
) {
    Card(
        modifier = Modifier
            .padding(start = 16.dp, top = 8.dp, bottom = 8.dp, end = 16.dp)
            .background(color = Color.White),
        elevation = CardDefaults.cardElevation(defaultElevation = 5.dp),
        shape = MaterialTheme.shapes.extraSmall

    ) {
        Surface(
            modifier = Modifier.fillMaxWidth(),
            shape = RectangleShape,
            onClick = {
                onTaskSelected(toDoTaskModel)
            }
        ) {
            Column(
                modifier = Modifier
                    .padding(all = LARGE_PADDING)
                    .fillMaxWidth()
            ) {
                Row() {
                    Text(
                        modifier = Modifier.weight(8f),
                        text = toDoTaskModel.title,
                        style = MaterialTheme.typography.headlineSmall,
                        fontWeight = FontWeight.Bold,
                        maxLines = 1
                    )
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(1f),
                        contentAlignment = Alignment.TopEnd
                    ) {
                        Canvas(
                            modifier = Modifier
                                .width(PRIORITY_INDICATOR_SIZE)
                                .height(
                                    PRIORITY_INDICATOR_SIZE
                                ),
                            onDraw = {
                                drawCircle(color = Priority.entries[toDoTaskModel.priority].color)
                            }
                        )
                    }
                }

                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = toDoTaskModel.description,
                    style = MaterialTheme.typography.titleMedium,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
    }
}

@Preview
@Composable
fun TaskItemPreview() {
    TaskItem(
        ToDoTaskModel(
            1,
            "Title 1",
            "Description",
            Priority.HIGH.ordinal
        ),
        {},
    )
}

@Preview
@Composable
fun TaskItemDarkModePreview() {
    ToDoTask_AudiologyTheme(darkTheme = true) {
        TaskItem(
            ToDoTaskModel(
                1,
                "Title 1",
                "Description",
                Priority.HIGH.ordinal
            ),
            {},
        )
    }
}