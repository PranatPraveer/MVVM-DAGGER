package com.example.mvvmdagger.viewmodels

import android.widget.ViewSwitcher.ViewFactory
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmdagger.repository.ProductRepository
import javax.inject.Inject

class MainViewModelFactory @Inject constructor(private val repository: ProductRepository): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(repository) as T
    }
}