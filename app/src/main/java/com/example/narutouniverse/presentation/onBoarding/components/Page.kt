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
        description = """To understand your characters in Naruto, delve into their pasts, explore their motivations, 
            |and unravel their unique personalities. Pay attention to their relationships, experiences, 
            |and growth throughout the series for a comprehensive understanding.""".trimMargin(),
        image = R.drawable.ic_board1
    ),
    Page(
        title = "Villages",
        description = """Charming villages, nestled amidst nature's embrace, portray idyllic simplicity. 
            |Quaint houses line narrow streets, and vibrant marketplaces bustle with local life, 
            |creating close-knit communities where traditions thrive and stories unfold""".trimMargin(),
        image = R.drawable.ic_board2
    ),
    Page(
        title = "Justu & Natures",
        description = """Jutsu, mystical techniques in anime, wield diverse elemental natures.From fire-spewing to water-manipulation, these powers shape battles and narratives, showcasing the intricate balance between characters and their extraordinary abilities.""".trimMargin(),
        image = R.drawable.ic_board3
    )
)