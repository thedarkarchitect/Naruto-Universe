package com.example.narutouniverse.presentation.onBoarding

sealed class OnBoardingEvent {
    data object SaveAppEntry: OnBoardingEvent()
}