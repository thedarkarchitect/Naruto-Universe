package com.example.narutouniverse.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class NinjaRank(
    val Gaiden: String?,
    val BlankPeriod: String?
): Parcelable
