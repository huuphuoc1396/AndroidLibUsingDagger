package com.example.lib

import javax.inject.Inject

class LibRepositoryImpl @Inject constructor() : LibRepository {
    override fun getMessage(): String {
        return "This message from the library using Dagger"
    }
}