package com.example.mvvmdagger.di

import com.example.mvvmdagger.Retrofit.FakerAPI
import com.example.mvvmdagger.utils.Constants
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
class NetworkModule {

    @Singleton
    @Provides
    fun providesRetrofit(): Retrofit{
        return Retrofit.Builder().baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    @Singleton
    fun providesFakerAPI(retrofit: Retrofit):FakerAPI{
        return retrofit.create(FakerAPI::class.java)
    }
}