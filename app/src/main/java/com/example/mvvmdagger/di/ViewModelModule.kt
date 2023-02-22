package com.example.mvvmdagger.di

import androidx.lifecycle.ViewModel
import com.example.mvvmdagger.viewmodels.MainViewModel
import com.example.mvvmdagger.viewmodels.MainViewModel2
import dagger.Binds
import dagger.Module
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey

@Module
abstract class ViewModelModule {

    @ClassKey(MainViewModel::class)
    @Binds
    @IntoMap
    abstract fun mainViewModel(mainViewModel: MainViewModel):ViewModel

    @ClassKey(MainViewModel2::class)
    @Binds
    @IntoMap
    abstract fun mainViewModel2(mainViewModel2: MainViewModel2):ViewModel

}