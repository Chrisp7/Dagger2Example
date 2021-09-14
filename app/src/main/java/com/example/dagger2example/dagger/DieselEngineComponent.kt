package com.example.dagger2example.dagger

import dagger.Component

@Component(modules = [DieselEngineModule::class])
interface DieselEngineComponent : EngineComponent