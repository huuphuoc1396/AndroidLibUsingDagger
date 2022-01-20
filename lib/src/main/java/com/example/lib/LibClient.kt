package com.example.lib

import android.app.Application
import android.content.Context
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

object LibClient {

    private var isInitialized = false

    fun init(app: Application) {
        isInitialized = true
        startKoin {
            androidContext(app)
            modules(libModule)
        }
    }

    fun start(context: Context) {
        if (!isInitialized) throw IllegalAccessError("Must be initialized first")
        LibActivity.start(context)
    }

}