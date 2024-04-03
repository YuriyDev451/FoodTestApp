package com.gukunov.foodtestapp.entity.category.categoryUImodel

data class CategoriesUIState(
    val categories: List<CategoriesUIModel>
)

data class CategoriesUIModel(
    var idCategory: String,
    var strCategory: String
)