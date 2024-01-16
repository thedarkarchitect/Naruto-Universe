package com.example.narutouniverse.presentation.onBoarding

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.narutouniverse.domain.useCases.appEntry.AppEntryUsesCases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class OnBoardingViewModel @Inject constructor(
    private val appEntryUsesCases: AppEntryUsesCases
): ViewModel() {

    fun onEvent(event: OnBoardingEvent){
        when(event){
            OnBoardingEvent.SaveAppEntry -> {
                viewModelScope.launch {
                    appEntryUsesCases.saveAppEntry()
                }
            }
        }
    }
}