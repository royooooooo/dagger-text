package com.example.daggertest.di.component

import com.example.daggertest.di.module.NetworkModule
import com.example.daggertest.ui.viewmodel.MainViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class])
interface ApplicationGraph {
    fun inject(viewModel: MainViewModel)
}