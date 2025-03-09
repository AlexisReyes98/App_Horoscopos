package com.example.app_horoscopos.UI.Providers

import org.junit.jupiter.api.Assertions.*
import org.junit.Test

class RandomCardProviderTest {
    @Test
    fun `getRandomCard should return a random card`(){
        val randomCard = RandomCardProvider()

        val card = randomCard.getLucky()

        assertNotNull(card)
    }
}