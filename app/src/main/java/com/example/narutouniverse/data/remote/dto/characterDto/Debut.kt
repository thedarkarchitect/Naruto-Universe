package com.example.narutouniverse.data.remote.dto.characterDto

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Debut(
    val manga: String?,
    val anime: String?,
    val novel: String?,
    val movie: String?,
    val game: String?,
    val ova: String?,
    val appearsIn: String?
): Parcelable
