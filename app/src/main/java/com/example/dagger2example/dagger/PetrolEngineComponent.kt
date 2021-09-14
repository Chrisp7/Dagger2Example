package com.example.dagger2example.dagger

import dagger.Component

@Component(modules = [PetrolEngineModule::class])
interface PetrolEngineComponent : EngineComponent