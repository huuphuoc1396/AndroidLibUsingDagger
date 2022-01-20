package com.example.androidlibusingdagger

import android.app.Application
import com.example.lib.LibClient

class App: Application() {

    override fun onCreate() {
        super.onCreate()
        LibClient.init(this)
    }
}