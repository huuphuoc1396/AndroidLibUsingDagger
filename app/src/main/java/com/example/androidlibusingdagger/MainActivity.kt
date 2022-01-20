package com.example.androidlibusingdagger

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.androidlibusingdagger.databinding.ActivityMainBinding
import com.example.lib.LibClient

class MainActivity : AppCompatActivity() {

    private lateinit var viewDataBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewDataBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewDataBinding.root)

        viewDataBinding.btnStartLibActivity.setOnClickListener {
            LibClient.start(this)
        }
    }
}