package com.heenu.yoonnote

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.heenu.yoonnote.ui.theme.YoonnoteTheme


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    YoonnoteTheme {
        MemoApp()
    }
}

@Composable
fun MemoApp(){
    YoonnoteTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            PostCards()
        }
    }
}