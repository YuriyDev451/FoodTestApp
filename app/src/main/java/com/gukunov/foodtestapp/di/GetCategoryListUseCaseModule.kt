package com.gukunov.foodtestapp.di

import com.gukunov.foodtestapp.data.categoryRepository.CategoryRepositoryInterface
import com.gukunov.foodtestapp.domain.GetCategoryListUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class GetCategoryListUseCaseModule {

    @Provides
    @Singleton
    fun getCategoryUseCase(categoryRepositoryInterface: CategoryRepositoryInterface) =
        GetCategoryListUseCase(categoryRepositoryInterface)

}