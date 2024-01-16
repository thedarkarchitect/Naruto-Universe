package com.example.narutouniverse.presentation.onBoarding.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.narutouniverse.ui.theme.NarutoUniverseTheme

@Composable
fun PageIndicator(
    modifier: Modifier = Modifier,
    pageSize: Int,
    selectedPage: Int,
    selectedColor: Color = MaterialTheme.colorScheme.secondaryContainer,
    unSelectedColor: Color = Color.White
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        repeat(times = pageSize) { page ->
            Box(
                modifier = modifier
                    .padding(horizontal = 4.dp)
                    .width(20.dp)
                    .height(8.dp)
                    .clip(CircleShape)
                    .size(16.dp)
                    .background(color = if (page == selectedPage) selectedColor else unSelectedColor)
            )
        }
    }
}

@Preview
@Composable
fun IndicatorPreview() {
    NarutoUniverseTheme {
        PageIndicator(
            pageSize = pages.size,
            selectedPage = 2
        )
    }
}