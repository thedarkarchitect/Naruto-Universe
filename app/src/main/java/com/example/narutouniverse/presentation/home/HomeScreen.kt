package com.example.narutouniverse.presentation.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.narutouniverse.ui.theme.NarutoUniverseTheme

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "You're Home")
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPrev() {
    NarutoUniverseTheme {
        HomeScreen()
    }
}