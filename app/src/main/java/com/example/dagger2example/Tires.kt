package com.example.dagger2example

import android.util.Log

class Tires {
    companion object {
        private const val TAG = "Car"
    }

    fun inflate() {
        Log.d(TAG, "Tires inflated")
    }
}