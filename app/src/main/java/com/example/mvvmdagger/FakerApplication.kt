package com.example.mvvmdagger

import android.app.Application
import com.example.mvvmdagger.di.ApplicationComponent
import com.example.mvvmdagger.di.DaggerApplicationComponent

class FakerApplication : Application(){
    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        applicationComponent=DaggerApplicationComponent.factory().create(this)
    }
}