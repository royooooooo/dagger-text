package com.example.daggertest

import android.app.Application
import com.example.daggertest.di.component.DaggerApplicationGraph

class MyApplication : Application() {
    val applicationComponent = DaggerApplicationGraph.create()
}