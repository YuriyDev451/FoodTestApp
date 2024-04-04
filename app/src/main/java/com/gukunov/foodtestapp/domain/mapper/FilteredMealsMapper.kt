package com.gukunov.foodtestapp.domain.mapper

import com.example.example.Meals
import com.gukunov.foodtestapp.common.BaseMapper
import com.gukunov.foodtestapp.entity.meal.mealUImodel.MealsStateUIModel
import com.gukunov.foodtestapp.entity.meal.mealUImodel.MealsUIModel
import javax.inject.Inject

class FilteredMealsMapper@Inject constructor():BaseMapper<List<Meals>, MealsStateUIModel> {
    override fun transform(input: List<Meals>): MealsStateUIModel {
        return MealsStateUIModel(
            meals = input.map {
                MealsUIModel(
                    idMeal = it.idMeal ?: "",
                    strMeal = it.strMeal ?: "",
                    strCategory=it.strCategory ?: "",
                    strArea = it.strArea?:"",
                    strInstructions = it.strInstructions?:"",
                    strMealThumb= it.strMealThumb?:"",
                    strIngredient1 = it.strIngredient1 ?:"",
                    strIngredient2 = it.strIngredient2 ?:"",
                    strIngredient3 = it.strIngredient3 ?:"",
                    strIngredient4 = it.strIngredient4 ?:"",
                    strIngredient5 = it.strIngredient5 ?:"",
                    strIngredient6 = it.strIngredient6 ?:"",
                    strIngredient7 = it.strIngredient7 ?:"",
                    strIngredient8 = it.strIngredient8 ?: "",
                    strIngredient9 = it.strIngredient9 ?: "",
                    strIngredient10 = it.strIngredient10 ?: "",
                    strIngredient11 = it.strIngredient11 ?: "",
                    strIngredient12 = it.strIngredient12 ?: "",
                    strIngredient13 = it.strIngredient13 ?: "",
                    strIngredient14 = it.strIngredient14 ?: "",
                    strIngredient15 = it.strIngredient15 ?: "",
                    strIngredient16 = it.strIngredient16 ?: "",
                    strIngredient17 = it.strIngredient17 ?: "",
                    strIngredient18 = it.strIngredient18 ?: "",
                    strIngredient19 = it.strIngredient19 ?: "",
                    strIngredient20 = it.strIngredient20 ?: ""
                )
            }
        )
    }
}