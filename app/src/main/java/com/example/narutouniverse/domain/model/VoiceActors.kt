package com.example.narutouniverse.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class VoiceActors(
    val japanese: List<String?>,
    val english: List<String?>
): Parcelable
