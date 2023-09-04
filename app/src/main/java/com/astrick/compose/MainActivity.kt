package com.astrick.compose

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.astrick.businesscard.BusinessCard
import com.astrick.core.ui.theme.BaseComposeTheme
import com.astrick.superhero.HeroesScreen
import com.astrick.superhero.data.HeroesRepository

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BaseComposeTheme {
//                BusinessCard()
//                DiceRoller()
//                LemonadeApp()
//                TipTimeLayout()
//                ArtSpace()
//                Affirmations()
//                WoofApp()
                HeroesScreen(heroes = HeroesRepository.heroes)
            }
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun PreviewBusiness() {
    BaseComposeTheme {
        BusinessCard()
    }
}
