package com.example.viewmodel_kotlin

import android.text.Editable
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TestViewModel:ViewModel() {

var number=0
    val currentNumber:MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()
    }

    val currentId: MutableLiveData<Editable> by lazy {
        MutableLiveData<Editable>()
    }
    val currentPass: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
}