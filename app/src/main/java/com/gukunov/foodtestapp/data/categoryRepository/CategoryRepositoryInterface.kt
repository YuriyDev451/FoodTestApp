package com.gukunov.foodtestapp.data.categoryRepository

import com.example.example.CategoriesResponse

interface CategoryRepositoryInterface {
    suspend fun getCategoryList(): CategoriesResponse?
}