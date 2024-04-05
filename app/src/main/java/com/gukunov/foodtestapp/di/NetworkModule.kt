package com.gukunov.foodtestapp.di

import android.app.Application
import com.google.gson.Gson
import com.gukunov.foodtestapp.network.CategoryService
import com.gukunov.foodtestapp.network.SearchService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton
import okhttp3.Cache



@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {


    @Provides
    @Singleton
    fun provideGson():Gson{
        return Gson()
    }

    @Provides
    @Singleton

    fun provideOkHttpClient(application: Application) :OkHttpClient{
        val cacheSize = (5 * 1024 * 1024).toLong() // 5 MB
        val cache = Cache(application.cacheDir, cacheSize)

        val client = OkHttpClient.Builder()
        client
            .cache(cache)
            .connectTimeout(60, TimeUnit.SECONDS)
            .readTimeout(60, TimeUnit.SECONDS)
            .writeTimeout(60, TimeUnit.SECONDS)
        return client.build()
    }

    @Provides
    @Singleton
    fun provideApiClient(gson: Gson, okHttpClient: OkHttpClient): Retrofit {
        val retrofit = Retrofit.Builder()
        retrofit.baseUrl("https://themealdb.com/api/json/v1/")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .client(okHttpClient)

        return retrofit.build()
    }

    @Provides
    @Singleton
    fun provideSearchService(retrofit: Retrofit): SearchService {
        return retrofit.create(SearchService::class.java)
    }

    @Provides
    @Singleton
    fun provideCategoryService(retrofit: Retrofit): CategoryService{
        return retrofit.create(CategoryService::class.java)
    }





}