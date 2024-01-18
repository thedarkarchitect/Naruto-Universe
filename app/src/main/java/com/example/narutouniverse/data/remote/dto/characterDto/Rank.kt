package com.example.narutouniverse.data.remote.dto.characterDto

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Rank(
    val ninjaRank: NinjaRank?,
    val ninjaRegistration: String?
): Parcelable
