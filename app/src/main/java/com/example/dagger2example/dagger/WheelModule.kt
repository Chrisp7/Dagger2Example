package com.example.dagger2example.dagger

import com.example.dagger2example.car.Rims
import com.example.dagger2example.car.Tires
import com.example.dagger2example.car.Wheels
import dagger.Module
import dagger.Provides

@Module
class WheelModule {
    companion object{
        @Provides
        fun provideRims(): Rims {
            return Rims()
        }

        @Provides
        fun provideTire(): Tires {
            val tire = Tires()
            tire.inflate()
            return tire
        }

        @Provides
        fun provideWheels(rims: Rims, tires: Tires): Wheels {
            return Wheels(rims, tires)
        }
    }

}