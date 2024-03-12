package com.example.horoscoapp.data.provider

import com.example.horoscoapp.domain.model.HoroscopeInfo
import com.example.horoscoapp.domain.model.HoroscopeInfo.*
import javax.inject.Inject


class HoroscopeProvider @Inject constructor(){

    fun getHoroscopes():List<HoroscopeInfo>{
        return listOf(
            Aries, Taurus, Gemini, Cancer, Leo,
            Virgo, Libra, Scorpio, Sagittarius,
            Capricorn, Aquarius, Pisces
        )
    }

}