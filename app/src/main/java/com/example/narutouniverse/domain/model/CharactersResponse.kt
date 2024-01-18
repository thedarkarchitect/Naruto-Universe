package com.example.narutouniverse.domain.model



data class CharacterResponse(
    val characters: List<Characters>,
    val currentPage: Int,
    val pageSize: Int,
    val total: Int
)
