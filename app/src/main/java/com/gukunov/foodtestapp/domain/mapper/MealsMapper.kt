package com.gukunov.foodtestapp.domain.mapper

import com.example.example.Meals
import com.gukunov.foodtestapp.common.BaseMapper
import com.gukunov.foodtestapp.entity.meal.mealUImodel.MealsUIModel

class MealsMapper : BaseMapper<Meals, MealsUIModel> {
    override fun transform(input: Meals) = MealsUIModel(
        idMeal = input.idMeal ?: "",
        strMeal = input.strMeal ?: "",
        strCategory = input.strCategory ?: "",
        strArea = input.strArea ?: "",
        strInstructions = input.strInstructions ?: "",
        strMealThumb = input.strMealThumb ?: "",
        strIngredient1 = input.strIngredient1 ?: "",
        strIngredient2 = input.strIngredient2 ?: "",
        strIngredient3 = input.strIngredient3 ?: "",
        strIngredient4 = input.strIngredient4 ?: "",
        strIngredient5 = input.strIngredient5 ?: "",
        strIngredient6 = input.strIngredient6 ?: "",
        strIngredient7 = input.strIngredient7 ?: "",
        strIngredient8 = input.strIngredient8 ?: "",
        strIngredient9 = input.strIngredient9 ?: "",
        strIngredient10 = input.strIngredient10 ?: "",
        strIngredient11 = input.strIngredient11 ?: "",
        strIngredient12 = input.strIngredient12 ?: "",
        strIngredient13 = input.strIngredient13 ?: "",
        strIngredient14 = input.strIngredient14 ?: "",
        strIngredient15 = input.strIngredient15 ?: "",
        strIngredient16 = input.strIngredient16 ?: "",
        strIngredient17 = input.strIngredient17 ?: "",
        strIngredient18 = input.strIngredient18 ?: "",
        strIngredient19 = input.strIngredient19 ?: "",
        strIngredient20 = input.strIngredient20 ?: ""
    )


}