package com.example.narutouniverse.domain.model

import com.example.narutouniverse.data.remote.dto.characterDto.Debut
import com.example.narutouniverse.data.remote.dto.characterDto.Family
import com.example.narutouniverse.data.remote.dto.characterDto.Personal
import com.example.narutouniverse.data.remote.dto.characterDto.Rank
import com.example.narutouniverse.data.remote.dto.characterDto.VoiceActors

data class Characters (
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