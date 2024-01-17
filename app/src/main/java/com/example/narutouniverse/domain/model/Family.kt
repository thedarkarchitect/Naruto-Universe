package com.example.narutouniverse.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Family(
    val father: String?,
    val mother: String?,
    val brother: String?,
    val sister: String?,
    val daughter: String?,
    val son: String?,
    val wife: String?,
    val clone: String?,
    val grandmother: String?,
    val grandfather: String?,
    val nephew: String?,
    val uncle: String?
): Parcelable
