package com.example.mvvmdagger.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mvvmdagger.models.Product
import com.example.mvvmdagger.repository.ProductRepository
import kotlinx.coroutines.launch

class MainViewModel(private val repository: ProductRepository):ViewModel() {
    val productsLiveData:LiveData<List<Product>>
    get() = repository.products

    init {
        viewModelScope.launch {
            repository.getProducts()
        }
    }
}