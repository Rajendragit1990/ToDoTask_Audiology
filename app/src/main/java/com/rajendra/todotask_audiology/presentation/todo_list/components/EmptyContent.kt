package com.rajendra.todotask_audiology.presentation.todo_list.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rajendra.todotask_audiology.R
import com.rajendra.todotask_audiology.ui.theme.ToDoTask_AudiologyTheme

@Composable
fun EmptyContent() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            modifier = Modifier
                .size(120.dp)
                .alpha(0.5f),
            painter = painterResource(id = R.drawable.ic_sad_face),
            contentDescription = stringResource(
                id = R.string.sad_face
            ),
            tint = MaterialTheme.colorScheme.primary
        )
        Text(
            text = stringResource(id = R.string.empty_content),
            modifier = Modifier.alpha(0.5f),
            color = MaterialTheme.colorScheme.primary,
            fontWeight = FontWeight.Bold,
            fontSize = MaterialTheme.typography.titleLarge.fontSize
        )
    }
}

@Preview
@Composable
fun EmptyContentPreview() {
    EmptyContent()
}

@Preview
@Composable
fun EmptyContentDarkModePreview() {
    ToDoTask_AudiologyTheme(darkTheme = true) {
        EmptyContent()
    }
}