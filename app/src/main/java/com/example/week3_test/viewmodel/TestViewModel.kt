package com.example.week3_test.viewmodel

import androidx.appcompat.content.res.AppCompatResources
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.week3_test.R

class TestViewModel : ViewModel() {
    val current: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }


    fun updateCurrentImageId() {
        current.value = when (current.value) {
            R.drawable.baseline_lock_black_48 -> R.drawable.baseline_lock_open_black_48;
            R.drawable.baseline_lock_open_black_48 -> R.drawable.baseline_lock_black_48;
            else -> R.drawable.baseline_lock_open_black_48;
        }
    }
}