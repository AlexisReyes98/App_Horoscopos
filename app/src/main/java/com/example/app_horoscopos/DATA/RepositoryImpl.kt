package com.example.app_horoscopos.DATA

import android.util.Log
import com.example.app_horoscopos.DATA.Network.HoroscopeApiService
import com.example.app_horoscopos.DOMAIN.Model.PredictionModel
import com.example.app_horoscopos.DOMAIN.Repository
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val apiService: HoroscopeApiService) : Repository {
    override suspend fun getPrediction(sign: String): PredictionModel? {
        runCatching { apiService.getHoroscope(sign) }
            .onSuccess { return it.toDomain() }
            .onFailure { Log.i("alexis", "Ha ocurrido un error ${it.message}") }
        return null
    }
}