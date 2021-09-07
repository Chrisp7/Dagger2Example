package com.example.dagger2example

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.dagger2example.car.Car
import com.example.dagger2example.dagger.DaggerCarComponent
import com.example.dagger2example.dagger.DieselEngineModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var car: Car
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DaggerCarComponent.builder()
            .dieselEngineModule(DieselEngineModule(100))
            .build()
            .inject(this)

        car.drive()
    }
}