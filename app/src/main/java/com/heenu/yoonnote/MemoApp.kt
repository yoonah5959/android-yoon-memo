package com.heenu.yoonnote

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.heenu.design.ui.theme.DesignTheme
import com.heenu.yoonnote.screen.NoteList
import com.heenu.yoonnote.screen.PinnedList
import com.heenu.yoonnote.screen.SearchBar


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DesignTheme {
        MemoApp()
    }
}

@Composable
fun MemoApp() {
    DesignTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                SearchBar()
                PinnedList()
                NoteList()
            }

        }
    }
}