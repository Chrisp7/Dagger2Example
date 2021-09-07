package com.example.dagger2example.dagger

import com.example.dagger2example.car.Engine
import com.example.dagger2example.car.PetrolEngine
import dagger.Binds
import dagger.Module

@Module
abstract class PetrolEngineModule {
    @Binds
    abstract fun bindEngine(engine: PetrolEngine): Engine
}