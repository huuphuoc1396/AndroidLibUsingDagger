package com.example.lib

import org.koin.dsl.module

val libModule = module {
    factory<LibRepository> { LibRepositoryImpl() }
}