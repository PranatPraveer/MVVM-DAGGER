package com.example.mvvmdagger.di

import android.content.Context
import androidx.lifecycle.ViewModel
import com.example.mvvmdagger.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class,DatabaseModule::class,ViewModelModule::class])
interface ApplicationComponent {

    fun inject(mainActivity: MainActivity)

    fun getMap(): Map<Class<*>, ViewModel>

    @Component.Factory
    interface Factory{
        fun create(@BindsInstance context: Context):ApplicationComponent
    }
}