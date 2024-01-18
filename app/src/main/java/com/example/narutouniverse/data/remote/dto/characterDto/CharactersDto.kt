package com.example.narutouniverse.data.remote.dto.characterDto


data class CharactersDto (
    val id: Int,
    val name: String,
    val images: List<String?>,
    val debut: Debut,
    val family: Family,
    val jutsu: List<String?>,
    val natureType: List<String?>,
    val personal: Personal,
    val rank: Rank?,
    val tools: List<String>,
    val uniqueTraits: List<String?>,
    val voiceActors: VoiceActors
)