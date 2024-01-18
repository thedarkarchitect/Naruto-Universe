package com.example.narutouniverse.presentation.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.narutouniverse.domain.repository.NarutoRepository
import com.example.narutouniverse.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val repository: NarutoRepository
): ViewModel() {

    private val _state = MutableStateFlow(CharacterState())
    val state = _state.asStateFlow()

    init {
        getCharacterList()
    }

    private fun getCharacterList() {
        viewModelScope.launch {
            repository.getCharacters().collectLatest {  result ->
                when(result) {
                    is Resource.Error -> {
                        _state.update {
                            it.copy(
                                isLoading = false
                            )
                        }
                    }
                    is Resource.Loading -> {
                        _state.update {
                            it.copy(
                                isLoading = true
                            )
                        }
                    }
                    is Resource.Success -> {
                        result.data?.let {  response ->
                            _state.update {
                                it.copy(
                                    characterList = response.characters
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}