package com.example.lib

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lib.databinding.ActivityLibBinding
import org.koin.android.ext.android.inject

class LibActivity : AppCompatActivity() {

    private lateinit var viewDataBinding: ActivityLibBinding

    private val repository: LibRepository by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewDataBinding = ActivityLibBinding.inflate(layoutInflater)
        setContentView(viewDataBinding.root)

        viewDataBinding.txtLibMessage.text = repository.getMessage()
    }

    companion object {
        fun start(context: Context) {
            context.startActivity(Intent(context, LibActivity::class.java))
        }
    }
}