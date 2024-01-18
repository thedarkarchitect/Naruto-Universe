package com.example.narutouniverse.data.remote.dto.characterDto

data class CharacterResponseDto(
    val characters: List<CharactersDto>,
    val currentPage: Int,
    val pageSize: Int,
    val total: Int
)
