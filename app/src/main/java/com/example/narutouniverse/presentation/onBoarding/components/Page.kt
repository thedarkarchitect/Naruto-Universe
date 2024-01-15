package com.example.narutouniverse.presentation.onBoarding.components

import androidx.annotation.DrawableRes
import com.example.narutouniverse.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int
)

val pages = listOf(
    Page(
        title = "Characters",
        description = "In a vibrant naruto world, all characters are trying to be the best and top ninja, get to know and understand your favorite character",
        image = R.drawable.ic_board1
    ),
    Page(
        title = "Villages",
        description = "Charming villages, nestled amidst nature's embrace, portray idyllic simplicity. Quaint houses line narrow streets, and vibrant marketplaces bustle with local life, creating close-knit communities where traditions thrive and stories unfold",
        image = R.drawable.ic_board2
    ),
    Page(
        title = "Justu & Natures",
        description = "Jutsu, mystical techniques in anime, wield diverse elemental natures. From fire-spewing to water-manipulation, these powers shape battles and narratives, showcasing the intricate balance between characters and their extraordinary abilities.",
        image = R.drawable.ic_board3
    )
)