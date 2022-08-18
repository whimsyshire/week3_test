package com.example.week3_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.content.res.AppCompatResources

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val image = findViewById<ImageView>(R.id.imageView)
        var current = R.drawable.baseline_lock_black_48;

        image.setOnClickListener {

            current = when(current){
                R.drawable.baseline_lock_black_48 -> R.drawable.baseline_lock_open_black_48;
                R.drawable.baseline_lock_open_black_48 -> R.drawable.baseline_lock_black_48;
                else -> R.drawable.baseline_lock_black_48;
            }
            image.setImageDrawable(AppCompatResources.getDrawable(this, current))
        }
    }
}