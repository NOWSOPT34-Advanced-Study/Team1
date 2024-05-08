package com.simhwa.data.signup.di

import com.simhwa.data.signup.datasource.SignUpDataSource
import com.simhwa.data.signup.datasource.SignUpDataSourceImpl
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
    fun provideSignUpDataSource(signUpDataSourceImpl: SignUpDataSourceImpl): SignUpDataSource =
        signUpDataSourceImpl
}