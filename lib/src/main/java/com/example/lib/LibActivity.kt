package com.example.lib

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class LibActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lib)
    }

    companion object {
        fun start(context: Context) {
            context.startActivity(Intent(context, LibActivity::class.java))
        }
    }
}