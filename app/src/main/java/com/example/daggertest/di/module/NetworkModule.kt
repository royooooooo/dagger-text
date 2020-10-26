package com.example.daggertest.di.module

import com.example.daggertest.model.api.LoginApiService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
class NetworkModule {
    @Provides
    fun providerLoginRetrofitService(): LoginApiService {
        return Retrofit.Builder().baseUrl("https://www.baidu.com").build()
            .create(LoginApiService::class.java)
    }
}