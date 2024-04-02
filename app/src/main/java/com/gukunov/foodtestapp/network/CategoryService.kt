package com.gukunov.foodtestapp.network

import com.example.example.CategoriesResponse
import retrofit2.http.GET


interface CategoryService {

    @GET("categories.php")
    suspend fun getCategory(): CategoriesResponse?
}