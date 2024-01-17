package com.example.narutouniverse

import androidx.compose.runtime.*
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.narutouniverse.domain.useCases.appEntry.AppEntryUsesCases
import com.example.narutouniverse.utils.Screens
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val appEntryUsesCases: AppEntryUsesCases
): ViewModel() {

    var startDestination by mutableStateOf(Screens.AppStartNavigation.route)
        private set

    init {
        appEntryUsesCases.readAppEntry().onEach { shouldStartFromHomeScreen ->
            if(shouldStartFromHomeScreen){
                startDestination = Screens.NarutoAppNavigation.route
            }
//            if(!shouldStartFromHomeScreen){
//                startDestination = Screens.AppStartNavigation.route
//            }
//            delay(500)
        }.launchIn(viewModelScope)
    }
}