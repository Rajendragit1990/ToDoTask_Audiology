package com.rajendra.todotask_audiology.di

import com.rajendra.todotask_audiology.data.repositories.ToDoRepositoryImpl
import com.rajendra.todotask_audiology.domain.repositories.ToDoRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class BindsModule {

    @Binds
    abstract fun provideToDoRepository(
        toDoRepositoryImpl: ToDoRepositoryImpl
    ): ToDoRepository
}