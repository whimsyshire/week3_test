package com.example.week3_test.viewmodel

import androidx.appcompat.content.res.AppCompatResources
import androidx.lifecycle.ViewModel
import com.example.week3_test.R

class TestViewModel : ViewModel() {
    var current = R.drawable.baseline_lock_black_48;

    fun updateCurrentImageId() {
        current = when (current) {
            R.drawable.baseline_lock_black_48 -> R.drawable.baseline_lock_open_black_48;
            R.drawable.baseline_lock_open_black_48 -> R.drawable.baseline_lock_black_48;
            else -> R.drawable.baseline_lock_open_black_48;
        }
    }
}