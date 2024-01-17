package com.example.narutouniverse.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Personal(
    val birthdate: String?,
    val sex: String,
//    val age: Age to use must be serialized -> same for height, weight
    val status: String?,
    val bloodType: String?,
    val kekkeiGenkai: List<String?>,
    val classification: List<String?>,
    val tailedBeast: String?,
    val occupation: List<String?>,
    val affiliation: List<String?>,
    val team: String?,
    val partner: List<String?>,
    val clan: String,
    val titles : List<String?>,

): Parcelable
