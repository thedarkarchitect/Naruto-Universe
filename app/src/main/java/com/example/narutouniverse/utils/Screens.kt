package com.example.narutouniverse.utils

sealed class Screens(val route: String) {
    data object OnBoardingScreen: Screens("Onboarding")
    data object HomeScreen: Screens("Home")
    data object AppStartNavigation: Screens("appStartNavigation")
    data object NarutoAppNavigation: Screens("narutoNavigation")
    data object DetailsScreen: Screens("details")

}