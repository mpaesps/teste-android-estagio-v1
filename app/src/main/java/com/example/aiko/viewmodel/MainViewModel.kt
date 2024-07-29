// viewmodel/MainViewModel.kt
package com.example.aiko.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.aiko.domain.DataClass
import com.example.aiko.domain.Repository


class MainViewModel : ViewModel() {
    private val repository = Repository()
    private val _dataList = MutableLiveData<List<DataClass>>()
    val dataList: LiveData<List<DataClass>> get() = _dataList

    init {
        fetchData()
    }

    private fun fetchData() {
        _dataList.value = repository.getData()
    }
}