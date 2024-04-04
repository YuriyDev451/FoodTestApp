package com.gukunov.foodtestapp.data.categoryRepository

import com.example.example.CategoriesResponse
import com.gukunov.foodtestapp.network.CategoryService
import javax.inject.Inject

class CategoryRepository@Inject constructor(private val categoryService: CategoryService):CategoryRepositoryInterface {
    override suspend fun getCategoryList(): CategoriesResponse? {
        return categoryService.getCategory()
    }
}