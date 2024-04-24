package com.simhwa.data.local

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityRetainedScoped
import javax.inject.Inject

private const val DATASTORE_NAME = "local_datastore"

private val Context.localDataStore: DataStore<Preferences> by preferencesDataStore(DATASTORE_NAME)

@ActivityRetainedScoped
class LocalDataStore @Inject constructor(
    @ApplicationContext private val context: Context,
) {
    private object Keys {
        val id = stringPreferencesKey(ID_KEY)
        val password = stringPreferencesKey(PW_KEY)
        val nickname = stringPreferencesKey(NICKNAME_KEY)
    }

    companion object {
        const val ID_KEY = "id_key"
        const val PW_KEY = "pw_key"
        const val NICKNAME_KEY = "nickname_key"
    }
}
