package com.example.narutouniverse.domain.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity
data class Characters (
    @PrimaryKey val id: Int,
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
) : Parcelable