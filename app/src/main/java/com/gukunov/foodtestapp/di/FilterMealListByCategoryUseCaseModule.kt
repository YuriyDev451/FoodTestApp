package com.gukunov.foodtestapp.di

import com.gukunov.foodtestapp.data.searchRepository.SearchRepositoryInterface
import com.gukunov.foodtestapp.domain.useCase.FilterMealListByCategoryUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class FilterMealListByCategoryUseCaseModule {


    @Provides
    @Singleton
    fun provideGetSearchListUseCase(searchRepositoryInterface: SearchRepositoryInterface) =
        FilterMealListByCategoryUseCase(searchRepositoryInterface)
}