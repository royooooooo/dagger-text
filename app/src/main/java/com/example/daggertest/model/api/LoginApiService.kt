package com.example.daggertest.model.api

import retrofit2.Call
import retrofit2.http.GET

interface LoginApiService {
    @GET
    fun getData(): Call<String>
}