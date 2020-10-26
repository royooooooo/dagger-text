package com.example.daggertest.model.repository

import com.example.daggertest.model.api.LoginApiService
import javax.inject.Inject

class UserRemoteDataSource @Inject constructor(private val loginApi: LoginApiService) {
    fun getUserList(): List<String> {
        return listOf()
    }
}