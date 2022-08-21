package com.example.week3_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.content.res.AppCompatResources
import androidx.lifecycle.ViewModel
import com.example.week3_test.viewmodel.TestViewModel

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var image: ImageView;
    //var current = R.drawable.baseline_lock_black_48;

    val viewModel = TestViewModel();

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        image = findViewById(R.id.imageView);
        image.setOnClickListener(this)

    }

//    override fun onSaveInstanceState(outState: Bundle) {
//        super.onSaveInstanceState(outState)
//        println("Save Instance State: ${current}")
//        outState.putInt("current", current);
//    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
//        println("Restore Instance State: ${current}")
//        current = savedInstanceState.getInt("current")
//        image?.setImageDrawable(AppCompatResources.getDrawable(this, current))
            updateCurrentImage()
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.imageView -> {
                viewModel.updateCurrentImageId();
                updateCurrentImage()
            }
        }
    }

    fun updateCurrentImage() {
        image.setImageDrawable(AppCompatResources.getDrawable(this, viewModel.current))
    }

}