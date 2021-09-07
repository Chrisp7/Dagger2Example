package com.example.dagger2example.dagger

import com.example.dagger2example.car.DieselEngine
import com.example.dagger2example.car.Engine
import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule(private val horsePower: Int) {

    @Provides
    fun provideDieselEngine(): Engine {
        return DieselEngine(horsePower)
    }
}