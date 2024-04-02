package com.gukunov.foodtestapp.data.searchRepository

import com.example.example.SearchResponse
import com.gukunov.foodtestapp.network.SearchService
import javax.inject.Inject

class SearchRepository @Inject constructor(private val searchService: SearchService):
    SearchRepositoryInterface {
    override suspend fun getSearchList(): SearchResponse? {
        return searchService.getSearch()
    }

}