package com.heenu.yoonnote.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.heenu.design.ui.theme.DColor
import com.heenu.design.ui.theme.DesignTheme

@Composable
fun SearchBar() {
    Row(
        Modifier
            .fillMaxWidth()
            .height(42.dp)
            .clip(shape = RoundedCornerShape(12.dp))
            .background(color = DColor.Gray4)
    ) {

        Icon(painter = androidx.compose.material.icons.Icons.Rounded.Search, contentDescription = null)
        TextField(value = , onValueChange = )
    }
}

@Preview("search_bar")
@Composable
fun PreviewSearchBar() {
    DesignTheme {
        SearchBar()
    }
}