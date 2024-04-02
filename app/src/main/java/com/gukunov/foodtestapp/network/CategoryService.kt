package com.gukunov.foodtestapp.network

import retrofit2.http.GET


interface CategoryService {

    @GET("categories.php")
    suspend fun getCategory()
}