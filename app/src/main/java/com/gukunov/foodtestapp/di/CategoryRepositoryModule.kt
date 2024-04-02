package com.gukunov.foodtestapp.di

import com.gukunov.foodtestapp.data.categoryRepository.CategoryRepository
import com.gukunov.foodtestapp.data.categoryRepository.CategoryRepositoryInterface
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class CategoryRepositoryModule {

    @Binds
    @Singleton
    abstract fun provideCategoryRepositoryModule(repository: CategoryRepository): CategoryRepositoryInterface
}