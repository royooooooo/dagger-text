package com.example.daggertest.di.module

import com.example.daggertest.model.api.LoginApiService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetworkModule {
    @Singleton
    @Provides
    fun providerLoginRetrofitService(): LoginApiService {
        return Retrofit.Builder().baseUrl("https://cat-fact.herokuapp.com")
            .addConverterFactory(GsonConverterFactory.create()).build()
            .create(LoginApiService::class.java)
    }
}