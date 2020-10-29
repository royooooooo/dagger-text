package com.example.daggertest.model.repository

import com.example.daggertest.model.Cat
import com.example.daggertest.model.api.LoginApiService
import retrofit2.Call
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserRepository @Inject constructor(private val loginApi: LoginApiService) {

    fun getUserList(): Call<Array<Cat>> {
        return loginApi.getData()
    }
}