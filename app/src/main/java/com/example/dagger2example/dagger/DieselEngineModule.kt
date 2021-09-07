package com.example.dagger2example.dagger

import com.example.dagger2example.car.DieselEngine
import com.example.dagger2example.car.Engine
import dagger.Binds
import dagger.Module

@Module
abstract class DieselEngineModule {
    @Binds
    abstract fun bindDieselEngine(dieselEngine: DieselEngine): Engine
}