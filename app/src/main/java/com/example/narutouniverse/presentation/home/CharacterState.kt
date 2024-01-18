package com.example.narutouniverse.presentation.home

import com.example.narutouniverse.data.remote.dto.characterDto.CharactersDto

data class CharacterState(
    val isLoading: Boolean = false,
    val error: String = "",
    val characterList: List<CharactersDto> = emptyList()
)
