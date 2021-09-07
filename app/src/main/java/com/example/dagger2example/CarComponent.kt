package com.example.dagger2example

import dagger.Component

@Component
interface CarComponent {
    fun getCar(): Car
    fun inject(mainActivity: MainActivity)
}