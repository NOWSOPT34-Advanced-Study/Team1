package com.simhwa.data.mainpage.di

import com.simhwa.data.mainpage.repository.MainPageRepository
import com.simhwa.data.mainpage.repository.MainPageRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.scopes.ActivityRetainedScoped

@Module
@InstallIn(ActivityRetainedComponent::class)
abstract class RepositoryModule {

    @Binds
    @ActivityRetainedScoped
    abstract fun bindMainPageRepository(mainPageRepositoryImpl: MainPageRepositoryImpl): MainPageRepository
}