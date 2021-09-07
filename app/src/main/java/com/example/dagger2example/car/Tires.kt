package com.example.dagger2example.car

import android.util.Log

class Tires {
    companion object {
        private const val TAG = "Car"
    }

    fun inflate() {
        Log.d(TAG, "Tires inflated")
    }
}