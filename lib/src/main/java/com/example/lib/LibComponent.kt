package com.example.lib

import dagger.Component

@Component(modules = [LibModule::class])
abstract class LibComponent {

    abstract fun inject(libActivity: LibActivity)
}