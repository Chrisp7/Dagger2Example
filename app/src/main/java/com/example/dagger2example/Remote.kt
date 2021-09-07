package com.example.dagger2example

import android.util.Log
import javax.inject.Inject

class Remote @Inject constructor() {
    companion object {
        private const val TAG = "car"
    }

    fun setListener(car: Car) {
        Log.d(TAG, "Remote connected")
    }
}