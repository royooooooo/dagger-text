package com.example.daggertest.di

import com.example.daggertest.ui.main.MainFragment
import dagger.Component

@Component
interface ApplicationComponent {
    fun inject(fragment: MainFragment)
}