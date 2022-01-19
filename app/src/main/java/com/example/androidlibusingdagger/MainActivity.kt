package com.example.androidlibusingdagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.ViewDataBinding
import com.example.androidlibusingdagger.databinding.ActivityMainBinding
import com.example.lib.LibActivity

class MainActivity : AppCompatActivity() {

    private lateinit var viewDataBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        viewDataBinding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(viewDataBinding.root)

        viewDataBinding.btnStartLibActivity.setOnClickListener {
            LibActivity.start(this)
        }
    }
}