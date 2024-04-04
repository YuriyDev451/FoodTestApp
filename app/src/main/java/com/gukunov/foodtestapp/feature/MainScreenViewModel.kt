package com.gukunov.foodtestapp.feature

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.gukunov.foodtestapp.common.Resource
import com.gukunov.foodtestapp.common.State
import com.gukunov.foodtestapp.domain.mapper.CategoriesMapper
import com.gukunov.foodtestapp.domain.mapper.FilteredMealsMapper
import com.gukunov.foodtestapp.domain.useCase.FilterMealListByCategoryUseCase
import com.gukunov.foodtestapp.domain.useCase.GetCategoryListUseCase
import com.gukunov.foodtestapp.entity.category.categoryUImodel.CategoriesUIState
import com.gukunov.foodtestapp.entity.meal.mealUImodel.MealsStateUIModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class MainScreenViewModel @Inject constructor(
    private var categoriesMapper: CategoriesMapper,
    private val getCategoryListUseCase: GetCategoryListUseCase,
    private val filteredMealsMapper: FilteredMealsMapper,
    private val filterMealListByCategoryUseCase: FilterMealListByCategoryUseCase
):ViewModel() {

    val state: MutableStateFlow<State?> = MutableStateFlow(null)


    val data = MutableLiveData<MealsStateUIModel>()
    val filteredData = MutableLiveData<MealsStateUIModel>()

    val categoryData = MutableLiveData<CategoriesUIState>()


//    suspend fun getMeals() {
//        getSearchListUseCase.getSearchList().collectLatest {list ->
//
//            when(list){
//                is Resource.Error -> state.emit(State.error(list.message))
//                is Resource.Loading -> state.emit(State.loading())
//                is Resource.Success -> {
//                    state.emit(State.success())
//                    list.data.let {
//                        val mapData = mealsMapper.transform(it)
//                        data.postValue(mapData)
//                    }
//
//                }
//            }
//        }
//    }

    fun filterMealsByCategory(category: String) {
        viewModelScope.launch {
            filterMealListByCategoryUseCase.filterMealListByCategory(category).collect { resource ->
                when (resource) {
                    is Resource.Error -> state.emit(State.error(resource.message))
                    is Resource.Loading -> state.emit(State.loading())
                    is Resource.Success -> {
                        state.emit(State.success())
                        resource.data?.let {
                            val mapData = filteredMealsMapper.transform(it)
                            filteredData.postValue(mapData)
                        }
                    }
                }
            }
        }
    }

    suspend fun getCategories(){
        getCategoryListUseCase.getCategory().collectLatest {list ->
            when(list){
                is Resource.Error -> state.emit(State.error(list.message))
                is Resource.Loading -> state.emit(State.loading())
                is Resource.Success -> {
                    state.emit(State.success())
                    list.data.let {
                        val mapData = categoriesMapper.transform(it)
                        categoryData.postValue(mapData)
                    }
                }

            }
        }
    }

}