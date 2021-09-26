package com.example.dagger2example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dagger2example.car.Car
import com.example.dagger2example.dagger.DaggerCarComponent
import com.example.dagger2example.dagger.DaggerDieselEngineComponent
import com.example.dagger2example.dagger.DaggerPetrolEngineComponent
import com.example.dagger2example.dagger.EngineComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var car: Car
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val engineComponent = DaggerDieselEngineComponent.create()
        DaggerCarComponent.builder().engineComponent(engineComponent).build().inject(this)
        car.drive()
    }
}