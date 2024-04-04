package com.gukunov.foodtestapp.domain.useCase

import com.example.example.Meals
import com.gukunov.foodtestapp.common.Resource
import com.gukunov.foodtestapp.data.searchRepository.SearchRepositoryInterface
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class FilterMealListByCategoryUseCase@Inject constructor(
    private val searchRepositoryInterface: SearchRepositoryInterface
) {
    fun filterMealListByCategory(category: String) = flow {
        emit(Resource.Loading())
        val filteredList = searchRepositoryInterface.getSearchList()?.meals?.filter { item ->
            item.strCategory == category
        }
        filteredList?.let {
            emit(Resource.Success(it))
        } ?: emit(Resource.Error("Error"))
        filteredList?.let {
            emit(Resource.Success(it))
        } ?: emit(Resource.Error("Error"))
    }

//    suspend fun filterMealsByCategory(category: String): Flow<Resource<List<Meals>>> = flow {
//        emit(Resource.Loading())
//        val meals = searchRepositoryInterface.getSearchList()
//        if (meals != null) {
//            val filteredMeals = meals.meals.filter { meal -> meal.strCategory == category }
//            emit(Resource.Success(filteredMeals))
//        } else {
//            emit(Resource.Error("Error filtering meals by category"))
//        }
//    }
}