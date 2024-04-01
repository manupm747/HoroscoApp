package com.example.horoscoapp.domain.usecase

import com.example.horoscoapp.domain.Repository
import javax.inject.Inject

class GetPredictionUseCase @Inject constructor(private val repository: Repository) {

    //el "invoke" permite llamar a esta funcion directamente desde el objeto entre los parentesis
    //asi queda un poco mejor, "más pro"
    suspend operator fun invoke(sign:String) = repository.getPrediction(sign)

}