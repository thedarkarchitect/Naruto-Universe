package com.example.narutouniverse.data.remote.dto.characterDto

import com.example.narutouniverse.domain.model.Characters

data class CharacterResponse(
    val characters: List<Characters>,
    val currentPage: Int,
    val pageSize: Int,
    val total: Int
)
