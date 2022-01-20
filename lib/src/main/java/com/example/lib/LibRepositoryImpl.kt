package com.example.lib

class LibRepositoryImpl : LibRepository {
    override fun getMessage(): String {
        return "This message from the library using Dagger"
    }
}