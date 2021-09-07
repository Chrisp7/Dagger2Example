package com.example.dagger2example.car

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(val wheels: Wheels, private val engine: Engine) {

    companion object {
        private const val TAG = "Car"
    }

    fun drive() {
        engine.start()
        Log.d(TAG, "driving... ")
    }

    @Inject
    fun setRemote(remote: Remote) {
        remote.setListener(this)
    }
}