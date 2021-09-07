package com.example.dagger2example

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(val wheels: Wheels, val engine: Engine) {
    companion object {
        private const val TAG = "Car"
    }

    fun drive() {
        Log.d(TAG, "driving... ")
    }

    @Inject
    fun setRemote(remote: Remote) {
        remote.setListener(this)
    }
}