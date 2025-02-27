package com.example.app_horoscopos.DOMAIN

import com.example.app_horoscopos.DOMAIN.Model.PredictionModel

interface Repository {
    suspend fun getPrediction(sign:String): PredictionModel?
}