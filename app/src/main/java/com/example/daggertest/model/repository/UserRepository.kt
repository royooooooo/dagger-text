package com.example.daggertest.model.repository

import com.example.daggertest.model.api.LoginApiService
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserRepository @Inject constructor(private val loginApi: LoginApiService) {

    fun getUserList(): String {
        var result = "test"
//        GlobalScope.launch(Dispatchers.IO) {
//            result = loginApi.getData()
//        }
        return result
    }
}