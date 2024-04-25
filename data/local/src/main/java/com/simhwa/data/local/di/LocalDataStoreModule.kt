package com.simhwa.data.local.di

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.PreferenceDataStoreFactory
import androidx.datastore.preferences.preferencesDataStoreFile
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object LocalDataStoreModule {
    private const val LOCAL_DATASTORE = "local_datastore"

    @Provides
    @Singleton
    fun localUserDataStore(@ApplicationContext appContext: Context): DataStore<androidx.datastore.preferences.core.Preferences> =
        PreferenceDataStoreFactory.create(
            produceFile = {
                appContext.preferencesDataStoreFile(LOCAL_DATASTORE)
            }
        )
}