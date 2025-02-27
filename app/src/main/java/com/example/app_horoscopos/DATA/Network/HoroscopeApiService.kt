package com.example.app_horoscopos.DATA.Network

import com.example.app_horoscopos.DATA.Network.Response.PredictionResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface HoroscopeApiService {

    @GET("/{sign}")
    suspend fun getHoroscope(@Path("sign") sign:String): PredictionResponse

}