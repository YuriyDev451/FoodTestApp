package com.gukunov.foodtestapp.data.categoryRepository

import com.example.example.CategoriesResponse
import com.example.example.SearchResponse

interface CategoryRepositoryInterface {
    suspend fun getCategoryList(): CategoriesResponse?
}