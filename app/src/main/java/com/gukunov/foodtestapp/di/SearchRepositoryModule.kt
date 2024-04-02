package com.gukunov.foodtestapp.di

import com.gukunov.foodtestapp.data.searchRepository.SearchRepository
import com.gukunov.foodtestapp.data.searchRepository.SearchRepositoryInterface
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class SearchRepositoryModule {

    @Binds
    @Singleton
    abstract fun provideSearchRepositoryModule(repository: SearchRepository): SearchRepositoryInterface
}