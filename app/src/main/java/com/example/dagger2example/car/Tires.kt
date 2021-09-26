package com.example.dagger2example.car

import android.util.Log
import javax.inject.Inject

class Tires @Inject constructor() {
    companion object {
        private const val TAG = "Car"
    }

    fun inflate() {
        Log.d(TAG, "Tires inflated")
    }
}