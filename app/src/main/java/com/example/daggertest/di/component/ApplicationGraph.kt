package com.example.daggertest.di.component

import com.example.daggertest.di.module.NetworkModule
import com.example.daggertest.ui.main.MainFragment
import dagger.Component

@Component(modules = [NetworkModule::class])
interface ApplicationGraph {
    fun inject(fragment: MainFragment)
}