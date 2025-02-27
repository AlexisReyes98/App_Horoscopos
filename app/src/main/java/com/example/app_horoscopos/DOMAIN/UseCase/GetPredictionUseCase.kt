package com.example.app_horoscopos.DOMAIN.UseCase

import com.example.app_horoscopos.DOMAIN.Repository
import javax.inject.Inject

class GetPredictionUseCase @Inject constructor(private val repository: Repository) {
    suspend operator fun invoke(sign: String) = repository.getPrediction(sign)
}