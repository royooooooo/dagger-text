package com.example.daggertest.model.api

import retrofit2.http.GET

interface LoginApiService {
    @GET("/facts/random?animal_type=cat&amount=2")
    suspend fun getData(): String
}