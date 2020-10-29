package com.example.daggertest.model.api

import com.example.daggertest.model.Cat
import retrofit2.Call
import retrofit2.http.GET

interface LoginApiService {
    @GET("/facts/random?animal_type=cat&amount=2")
    fun getData(): Call<Array<Cat>>
}