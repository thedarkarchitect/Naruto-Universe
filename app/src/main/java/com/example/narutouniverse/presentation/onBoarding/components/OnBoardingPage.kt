package com.example.narutouniverse.presentation.onBoarding.components

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.narutouniverse.ui.theme.NarutoUniverseTheme

@Composable
fun OnBoardingPage(
    modifier: Modifier = Modifier,
    page: Page
) {
    Column(
        modifier = modifier.background(MaterialTheme.colorScheme.primary)
    ) {
        Image(
            modifier = modifier
                .fillMaxWidth()
                .fillMaxHeight(fraction = 0.5f)
            ,
            painter = painterResource(id = page.image),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
        Text(
            modifier = modifier.padding(start = 16.dp, top = 16.dp, end = 16.dp),
            text = page.title,
            style = MaterialTheme.typography.displayMedium,
            color =  if(isSystemInDarkTheme()) Color.White else Color.Black
        )
        Text(
            modifier = modifier.padding(start = 16.dp, end = 16.dp, bottom = 16.dp),
            text = page.description,
            style = MaterialTheme.typography.bodyLarge.copy(fontWeight = FontWeight.Normal),
            fontSize = 29.sp,//might have to change the letter size
            color =  if(isSystemInDarkTheme()) Color.White else Color.Black
        )
    }
}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
@Composable
fun OnboardPagePreview() {
    NarutoUniverseTheme {
        OnBoardingPage(page = pages[0])
    }
}