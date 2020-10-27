package com.example.daggertest.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.daggertest.di.component.DaggerApplicationGraph
import com.example.daggertest.model.repository.UserRepository
import javax.inject.Inject

class MainViewModel : ViewModel() {

    init {
        DaggerApplicationGraph.create().inject(this)
    }

    @Inject
    lateinit var userRepository: UserRepository

    fun getUser(): String = userRepository.getUserList()
}