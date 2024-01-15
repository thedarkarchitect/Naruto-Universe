package com.example.narutouniverse.presentation.onBoarding.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.narutouniverse.presentation.onBoarding.OnBoardingEvent
import com.example.narutouniverse.ui.theme.NarutoUniverseTheme
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun OnBoardingScreen(
    modifier: Modifier = Modifier,
    onEvent: (OnBoardingEvent) -> Unit
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.primary)
    ) {

        val pagerState = rememberPagerState(initialPage = 0) {
            pages.size
        }

        val currentPage = pagerState.currentPage
        val scope = rememberCoroutineScope()

        HorizontalPager(state = pagerState) { pageIndex ->
            OnBoardingPage(page = pages[pageIndex])
        }
//        Spacer(modifier = modifier.weight(1f))
        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(16.dp),
//            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            PageIndicator(pageSize = pages.size, selectedPage = currentPage)

            Spacer(modifier = modifier.weight(1f))

            Row{

                NextButton(page = currentPage) {
                    scope.launch {
                        pagerState.animateScrollToPage(page = currentPage + 1)
                    }
                }

                BackButton(page = currentPage) {
                    scope.launch {
                        pagerState.animateScrollToPage(page = currentPage - 1)
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun OnBoardScreenPreview() {
    NarutoUniverseTheme {
        OnBoardingScreen(onEvent = {})
    }
}