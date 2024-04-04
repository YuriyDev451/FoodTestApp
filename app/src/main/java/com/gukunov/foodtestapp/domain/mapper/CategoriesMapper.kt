package com.gukunov.foodtestapp.domain.mapper

import com.example.example.Categories
import com.example.example.CategoriesResponse
import com.gukunov.foodtestapp.common.BaseMapper
import com.gukunov.foodtestapp.entity.category.categoryUImodel.CategoriesUIModel
import com.gukunov.foodtestapp.entity.category.categoryUImodel.CategoriesUIState
import javax.inject.Inject

class CategoriesMapper @Inject constructor() : BaseMapper<CategoriesResponse?, CategoriesUIState> {
    override fun transform(input: CategoriesResponse?): CategoriesUIState{
        return CategoriesUIState(
            categories = input!!.categories.map {
                CategoriesUIModel(
                    idCategory = it.idCategory?:"",
                    strCategory = it.strCategory?:""
                )
            }
        )
    }



}