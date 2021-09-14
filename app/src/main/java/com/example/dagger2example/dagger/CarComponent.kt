package com.example.dagger2example.dagger

import com.example.dagger2example.MainActivity
import com.example.dagger2example.car.Car
import dagger.Component

@Component(
    dependencies = [EngineComponent::class]
)
interface CarComponent {
    fun getCar(): Car
}