package com.heenu.yoonnote

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.heenu.design.ui.theme.DesignTheme


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
            PostCards()
        }
    }
}