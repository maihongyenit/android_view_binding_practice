package com.example.android_view_binding_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android_view_binding_practice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var viewBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        viewBinding.text.text = "Hello from Main Activity"
        setContentView(viewBinding.root)
    }
}