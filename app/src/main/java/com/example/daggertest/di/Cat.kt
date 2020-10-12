package com.example.daggertest.di

import javax.inject.Inject

class Cat @Inject constructor(private val dog: Dog) {
    override fun toString() = "the cat ${dog.name}"
}
