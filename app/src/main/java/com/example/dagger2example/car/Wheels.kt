package com.example.dagger2example.car

import javax.inject.Inject

class Wheels @Inject constructor(private val rims: Rims, private val tires: Tires)