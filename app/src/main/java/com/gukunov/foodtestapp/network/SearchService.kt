package com.gukunov.foodtestapp.network

import com.example.example.MealsResponse
import retrofit2.http.GET

interface SearchService {

    @GET("1/search.php?s")
    suspend fun getSearch():MealsResponse?
}