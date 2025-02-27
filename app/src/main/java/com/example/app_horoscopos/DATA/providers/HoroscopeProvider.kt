package com.example.app_horoscopos.DATA.providers

import com.example.app_horoscopos.DOMAIN.Model.HoroscopeInfo
import com.example.app_horoscopos.DOMAIN.Model.HoroscopeInfo.*
import javax.inject.Inject

class HoroscopeProvider @Inject constructor() {
    fun getHoroscopes(): List<HoroscopeInfo> {
        return listOf(
            Aries,
            Taurus,
            Gemini,
            Cancer,
            Leo,
            Virgo,
            Libra,
            Scorpio,
            Sagittarius,
            Capricorn,
            Aquarius,
            Pisces
        )
    }
}