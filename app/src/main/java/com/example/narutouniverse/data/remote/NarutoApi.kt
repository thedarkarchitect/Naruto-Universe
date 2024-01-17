package com.example.narutouniverse.data.remote

import androidx.room.Query
import com.example.narutouniverse.data.remote.dto.characterDto.CharacterResponse
import retrofit2.http.GET

interface NarutoApi {
    @GET("characters")
    suspend fun getCharacters(): CharacterResponse

    @GET("characters/{id}")
    suspend fun getCharactersDetails(): CharacterResponse

}