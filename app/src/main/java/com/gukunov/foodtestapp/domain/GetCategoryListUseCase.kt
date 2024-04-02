package com.gukunov.foodtestapp.domain

import com.gukunov.foodtestapp.common.Resource
import com.gukunov.foodtestapp.data.categoryRepository.CategoryRepositoryInterface
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetCategoryListUseCase @Inject constructor(
    private val categoryRepositoryInterface: CategoryRepositoryInterface
) {
    fun getCategory() = flow {
        emit(Resource.Loading())
        categoryRepositoryInterface.getCategoryList()?.let {
            emit(Resource.Success(it))
        }?: emit(Resource.Error("Error"))
    }.catch {
        emit(Resource.Error(it.localizedMessage))
    }

}