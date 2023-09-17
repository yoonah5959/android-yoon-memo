package com.heenu.yoonnote

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.heenu.yoonnote.ui.theme.YoonnoteTheme

@Composable
fun PostCards() {
    Row() {
        Image(
            painter = painterResource(id = R.drawable.post_1_thumb),
            contentDescription = null,
            modifier = Modifier.padding(16.dp)
        )
    }
}


@Preview("post card")
@Composable
fun PostCardPreview() {
    YoonnoteTheme {
        Surface {
            PostCards()
        }
    }
}


