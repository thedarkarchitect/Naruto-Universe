package com.example.narutouniverse.domain.repository


import com.example.narutouniverse.data.remote.dto.characterDto.CharacterResponseDto
import com.example.narutouniverse.data.remote.dto.characterDto.CharactersDto
import com.example.narutouniverse.utils.Resource
import kotlinx.coroutines.flow.Flow

interface NarutoRepository {
    fun getCharacters(): Flow<Resource<CharacterResponseDto>>
    fun getCharacter(id: Int): Flow<Resource<CharactersDto>>
//    suspend fun upsertCharacter(characters: Characters)
//    suspend fun deleteCharacter(characters: Characters)
//    fun selectCharacters(): Flow<List<Characters>>
//    fun selectedCharacter(id: Int): Characters
}