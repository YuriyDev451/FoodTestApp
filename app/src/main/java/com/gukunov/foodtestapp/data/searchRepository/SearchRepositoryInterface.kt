package com.gukunov.foodtestapp.data.searchRepository

import com.example.example.SearchResponse

interface SearchRepositoryInterface {
    suspend fun getSearchList(): SearchResponse?
}