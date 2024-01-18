package com.example.narutouniverse.presentation.graph

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation
import com.example.narutouniverse.presentation.home.HomeViewModel
import com.example.narutouniverse.presentation.home.components.HomeScreen
import com.example.narutouniverse.presentation.onBoarding.OnBoardingViewModel
import com.example.narutouniverse.presentation.onBoarding.components.OnBoardingScreen
import com.example.narutouniverse.utils.Screens

@Composable
fun NavGraph(
    startDestination: String
) {

    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = startDestination
    ){
        navigation(
            route = Screens.AppStartNavigation.route,
            startDestination = Screens.OnBoardingScreen.route
        ){
            composable(route = Screens.OnBoardingScreen.route) {
                val viewModel = hiltViewModel<OnBoardingViewModel>()
                OnBoardingScreen(
                    navController = navController,
                    onEvent = viewModel::onEvent
                )
            }
        }
        navigation(
            route = Screens.NarutoAppNavigation.route,
            startDestination = Screens.HomeScreen.route
        ){
            composable(route = Screens.HomeScreen.route) {
                val homeViewModel = hiltViewModel<HomeViewModel>()
                val state = homeViewModel.state.collectAsState().value
                HomeScreen(
                    state = state
                )
            }
        }
    }
}