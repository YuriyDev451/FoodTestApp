package com.gukunov.foodtestapp.domain.useCase

import com.gukunov.foodtestapp.common.Resource
import com.gukunov.foodtestapp.data.searchRepository.SearchRepositoryInterface
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetSearchListUseCase @Inject constructor(
    private val searchRepositoryInterface: SearchRepositoryInterface
) {

    fun getSearchList() = flow {
        emit(Resource.Loading())
        searchRepositoryInterface.getSearchList()?.let {
            emit(Resource.Success(it))
        } ?: emit(Resource.Error("Error"))
    }.catch {
        emit(Resource.Error(it.localizedMessage))
    }

}