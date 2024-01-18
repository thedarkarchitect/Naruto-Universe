package com.example.narutouniverse.data.remote.dto.characterDto

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class VoiceActors(
    val japanese: List<String?>,
    val english: List<String?>
): Parcelable
