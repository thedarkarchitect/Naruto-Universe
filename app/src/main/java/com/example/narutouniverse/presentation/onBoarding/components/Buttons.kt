package com.example.narutouniverse.presentation.onBoarding.components

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.narutouniverse.ui.theme.NarutoUniverseTheme

@Composable
fun NextButton(
    page: Int,
    onClick: () -> Unit
) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.secondaryContainer,
            contentColor = if(isSystemInDarkTheme()) Color.White else Color.Black
        ),
        shape = RoundedCornerShape(size = 6.dp)
    ) {
        Text(
            text = if(page != 2) "Next" else "Get Started",
            style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.SemiBold)
        )
    }
}

@Composable
fun BackButton(
    page: Int,
    onClick: () -> Unit
) {
    TextButton(
        onClick = onClick,
    ) {
        (if(page != 0)"Back" else null)?.let {
            Text(
                text = it,
                style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.SemiBold),
                color = if(isSystemInDarkTheme()) Color.White else Color.Black
            )
        }
    }
}

@Preview
@Composable
fun NextButtonPreview() {
    NarutoUniverseTheme {
        Row {
            BackButton(page = 2) {}
            NextButton(page = 2) {}
        }

    }
}