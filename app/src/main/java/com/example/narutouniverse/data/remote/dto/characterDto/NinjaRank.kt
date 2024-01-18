package com.example.narutouniverse.data.remote.dto.characterDto

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class NinjaRank(
    val Gaiden: String?,
    val BlankPeriod: String?
): Parcelable
