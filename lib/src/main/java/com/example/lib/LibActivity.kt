package com.example.lib

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lib.databinding.ActivityLibBinding
import javax.inject.Inject

class LibActivity : AppCompatActivity() {

    private lateinit var viewDataBinding: ActivityLibBinding

    @Inject
    lateinit var repository: LibRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewDataBinding = ActivityLibBinding.inflate(layoutInflater)
        setContentView(viewDataBinding.root)

        // Inject dependencies to LibActivity
        DaggerLibComponent.create().inject(this)

        viewDataBinding.txtLibMessage.text = repository.getMessage()
    }

    companion object {
        fun start(context: Context) {
            context.startActivity(Intent(context, LibActivity::class.java))
        }
    }
}