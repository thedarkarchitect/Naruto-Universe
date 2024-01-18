package com.example.narutouniverse.presentation.home.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.narutouniverse.presentation.home.CharacterState
import com.example.narutouniverse.ui.theme.NarutoUniverseTheme

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    state: CharacterState
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
       LazyColumn(){
           items(state.characterList){it ->
               Text(text = it.name)
           }
       }

    }
}

//@Preview(showBackground = true)
//@Composable
//fun HomeScreenPrev() {
//    NarutoUniverseTheme {
//        HomeScreen(
//
//        )
//    }
//}