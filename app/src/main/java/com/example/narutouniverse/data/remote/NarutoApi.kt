package com.example.narutouniverse.data.remote

import com.example.narutouniverse.data.remote.dto.characterDto.CharacterResponseDto
import com.example.narutouniverse.data.remote.dto.characterDto.CharactersDto
import retrofit2.http.GET
import retrofit2.http.Path

interface NarutoApi {
    @GET("characters")
    suspend fun getCharacters(
//        @Query("page") page: Int,
//        @Query("limit") limit: Int
    ): CharacterResponseDto

    @GET("characters/{ids}")
    suspend fun getCharactersDetails(
        @Path("ids") id: Int
    ): CharactersDto

}