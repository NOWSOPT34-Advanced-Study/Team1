package com.simhwa.data.mainpage.di

import com.simhwa.data.mainpage.datasource.MainPageDataSource
import com.simhwa.data.mainpage.datasource.MainPageDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.scopes.ActivityRetainedScoped

@Module
@InstallIn(ActivityRetainedComponent::class)
object DataSourceModule {
    @Provides
    @ActivityRetainedScoped
    fun provideMainPageDataSource(mainPageDataSourceImpl: MainPageDataSourceImpl): MainPageDataSource =
        mainPageDataSourceImpl
}