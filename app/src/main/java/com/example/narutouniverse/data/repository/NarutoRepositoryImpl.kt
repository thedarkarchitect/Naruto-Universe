package com.example.narutouniverse.data.repository

import com.example.narutouniverse.data.remote.NarutoApi
import com.example.narutouniverse.data.remote.dto.characterDto.CharacterResponseDto
import com.example.narutouniverse.data.remote.dto.characterDto.CharactersDto
import com.example.narutouniverse.domain.repository.NarutoRepository
import com.example.narutouniverse.utils.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class NarutoRepositoryImpl(
    private val api: NarutoApi
): NarutoRepository {
    override fun getCharacters(): Flow<Resource<CharacterResponseDto>> = flow{
        emit(Resource.Loading())
        try {
            val result = api.getCharacters()
            emit(Resource.Success(data = result))
            return@flow
        } catch (e: Exception) {
            e.printStackTrace()
            emit(Resource.Error(data = null, message = "Error Loading the character response"))
            return@flow
        }
    }

    override fun getCharacter(id: Int): Flow<Resource<CharactersDto>> = flow{
        emit(Resource.Loading())
        try {
            val result = api.getCharactersDetails(id)
            emit(Resource.Success(data = result))
            return@flow
        } catch (e: Exception) {
            e.printStackTrace()
            emit(Resource.Error(data = null, message = "Error Loading the character details"))
            return@flow
        }
    }
}