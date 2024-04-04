package com.gukunov.foodtestapp.domain.mapper

import com.example.example.Meals
import com.example.example.MealsResponse
import com.gukunov.foodtestapp.common.BaseMapper
import com.gukunov.foodtestapp.entity.meal.mealUImodel.MealsStateUIModel
import com.gukunov.foodtestapp.entity.meal.mealUImodel.MealsUIModel
import javax.inject.Inject

class MealsMapper @Inject constructor() : BaseMapper<MealsResponse?, MealsStateUIModel> {



    override fun transform(input: MealsResponse?): MealsStateUIModel{
        return MealsStateUIModel(
            meals = input!!.meals.map {
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

//    MealsUIModel(
//        idMeal = input?.meals?.firstOrNull()?.idMeal ?: "",
//        strMeal = input?.meals?.firstOrNull()?.strMeal ?: "",
//        strCategory = input?.meals?.firstOrNull()?.strCategory ?: "",
//        strArea = input?.meals?.firstOrNull()?.strArea ?: "",
//        strInstructions = input?.meals?.firstOrNull()?.strInstructions ?: "",
//        strMealThumb = input?.meals?.firstOrNull()?.strMealThumb ?: "",
//        strIngredient1 = input?.meals?.firstOrNull()?.strIngredient1 ?: "",
//        strIngredient2 = input?.meals?.firstOrNull()?.strIngredient2 ?: "",
//        strIngredient3 = input?.meals?.firstOrNull()?.strIngredient3 ?: "",
//        strIngredient4 = input?.meals?.firstOrNull()?.strIngredient4 ?: "",
//        strIngredient5 = input?.meals?.firstOrNull()?.strIngredient5 ?: "",
//        strIngredient6 = input?.meals?.firstOrNull()?.strIngredient6 ?: "",
//        strIngredient7 = input?.meals?.firstOrNull()?.strIngredient7 ?: "",
//        strIngredient8 = input?.meals?.firstOrNull()?.strIngredient8 ?: "",
//        strIngredient9 = input?.meals?.firstOrNull()?.strIngredient9 ?: "",
//        strIngredient10 = input?.meals?.firstOrNull()?.strIngredient10 ?: "",
//        strIngredient11 = input?.meals?.firstOrNull()?.strIngredient11 ?: "",
//        strIngredient12 = input?.meals?.firstOrNull()?.strIngredient12 ?: "",
//        strIngredient13 = input?.meals?.firstOrNull()?.strIngredient13 ?: "",
//        strIngredient14 = input?.meals?.firstOrNull()?.strIngredient14 ?: "",
//        strIngredient15 = input?.meals?.firstOrNull()?.strIngredient15 ?: "",
//        strIngredient16 = input?.meals?.firstOrNull()?.strIngredient16 ?: "",
//        strIngredient17 = input?.meals?.firstOrNull()?.strIngredient17 ?: "",
//        strIngredient18 = input?.meals?.firstOrNull()?.strIngredient18 ?: "",
//        strIngredient19 = input?.meals?.firstOrNull()?.strIngredient19 ?: "",
//        strIngredient20 = input?.meals?.firstOrNull()?.strIngredient20 ?: ""
//    )

}