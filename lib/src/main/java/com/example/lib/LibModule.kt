package com.example.lib

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface LibModule {

    @Binds
    fun provideLibRepository(repository: LibRepositoryImpl) : LibRepository
}