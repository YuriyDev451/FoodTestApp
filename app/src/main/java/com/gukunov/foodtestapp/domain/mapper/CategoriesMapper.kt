package com.gukunov.foodtestapp.domain.mapper

import com.example.example.Categories
import com.gukunov.foodtestapp.common.BaseMapper
import com.gukunov.foodtestapp.entity.category.categoryUImodel.CategoriesUIModel

class CategoriesMapper : BaseMapper<Categories, CategoriesUIModel> {
    override fun transform(input: Categories) = CategoriesUIModel(
        idCategory = input.idCategory ?: "",
        strCategory = input.strCategory ?: ""
    )


}