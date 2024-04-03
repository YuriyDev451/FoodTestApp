package com.gukunov.foodtestapp.di

import com.gukunov.foodtestapp.data.searchRepository.SearchRepositoryInterface
import com.gukunov.foodtestapp.domain.useCase.GetSearchListUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class GetSearchListUseCaseModule {

    @Provides
    @Singleton
    fun provideGetSearchListUseCase(searchRepositoryInterface: SearchRepositoryInterface) =
        GetSearchListUseCase(searchRepositoryInterface)
}