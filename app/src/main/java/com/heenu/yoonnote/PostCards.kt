package com.heenu.yoonnote

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.heenu.design.ui.theme.DColor
import com.heenu.design.ui.theme.DesignTheme

@Composable
fun PostCards() {
    Row(Modifier.padding(horizontal = 16.dp, vertical = 8.dp)) {
        Image(
            painter = painterResource(id = R.drawable.post_1_thumb),
            contentDescription = null,
            modifier = Modifier.padding(4.dp)
        )
        Column {
            Text(text = "this is title, very happy day", fontSize = 14.sp)
            Text(text = "2023.1.14", fontSize = 10.sp, color = DColor.Gray8)
        }
    }
}


@Preview("post card")
@Composable
fun PostCardPreview() {
    DesignTheme {
        Surface {
            PostCards()
        }
    }
}


