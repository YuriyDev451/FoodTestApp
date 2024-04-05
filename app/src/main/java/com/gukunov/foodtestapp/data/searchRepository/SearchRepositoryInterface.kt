package com.gukunov.foodtestapp.data.searchRepository

import com.example.example.MealsResponse

interface SearchRepositoryInterface {
    suspend fun getSearchList(): MealsResponse?

}