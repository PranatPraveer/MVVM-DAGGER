package com.example.mvvmdagger.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.mvvmdagger.Retrofit.FakerAPI
import com.example.mvvmdagger.db.FakerDB
import com.example.mvvmdagger.models.Product
import javax.inject.Inject

class ProductRepository @Inject constructor(private val fakerAPI: FakerAPI,private val fakerDB: FakerDB){

    private val _products=MutableLiveData<List<Product>>()
    val products: LiveData<List<Product>>
    get() = _products

    suspend fun getProducts(){
        val result=fakerAPI.getProducts()
        if(result.isSuccessful && result.body()!=null){
            fakerDB.getFakerDAO().addProducts(result.body()!!)
            _products.postValue(result.body())
        }
    }
}
