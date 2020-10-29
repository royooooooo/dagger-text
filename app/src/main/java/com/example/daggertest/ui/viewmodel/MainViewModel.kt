package com.example.daggertest.ui.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.daggertest.di.component.DaggerApplicationGraph
import com.example.daggertest.model.Cat
import com.example.daggertest.model.repository.UserRepository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class MainViewModel : ViewModel() {

    init {
        DaggerApplicationGraph.create().inject(this)
    }

    var userInfo = MutableLiveData<Array<Cat>>().apply { initUserInfo() }

    @Inject
    lateinit var userRepository: UserRepository

    private fun initUserInfo() {
        userRepository.getUserList().enqueue(object : Callback<Array<Cat>> {
            override fun onResponse(call: Call<Array<Cat>>, response: Response<Array<Cat>>) {
                Log.i("TAG", "onResponse: ${response.body()}")
                userInfo.value = response.body()
            }

            override fun onFailure(call: Call<Array<Cat>>, t: Throwable) {
                Log.i("TAG", "onFailure: ${t.localizedMessage}")
            }
        })
    }
}