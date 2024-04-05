package com.gukunov.foodtestapp.network

import com.example.example.CategoriesResponse
import retrofit2.http.GET


interface CategoryService {

    @GET("1/categories.php")
    suspend fun getCategory(): CategoriesResponse?
}