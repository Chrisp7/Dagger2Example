package com.example.dagger2example

import dagger.Component

@Component(modules = [WheelModule::class])
interface CarComponent {
    fun getCar(): Car
    fun inject(mainActivity: MainActivity)
}