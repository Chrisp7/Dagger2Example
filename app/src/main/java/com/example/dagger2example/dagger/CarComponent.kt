package com.example.dagger2example.dagger

import com.example.dagger2example.MainActivity
import dagger.Component

@Component(
    dependencies = [EngineComponent::class]
)
interface CarComponent {
    fun inject(mainActivity: MainActivity)
}