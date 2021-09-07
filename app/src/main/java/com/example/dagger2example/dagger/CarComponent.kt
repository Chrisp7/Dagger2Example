package com.example.dagger2example.dagger

import com.example.dagger2example.MainActivity
import com.example.dagger2example.car.Car
import dagger.Component

@Component(modules = [WheelModule::class, DieselEngineModule::class])
interface CarComponent {
    fun getCar(): Car
    fun inject(mainActivity: MainActivity)
}