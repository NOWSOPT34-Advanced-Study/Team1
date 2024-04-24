package com.simhwa.data.local

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.emptyPreferences
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import com.simhwa.data.local.model.UserInfo
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityRetainedScoped
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.map
import java.io.IOException
import javax.inject.Inject

private const val DATASTORE_NAME = "local_datastore"

private val Context.localDataStore: DataStore<Preferences> by preferencesDataStore(DATASTORE_NAME)

@ActivityRetainedScoped
class LocalDataStore @Inject constructor(
    @ApplicationContext private val context: Context,
) {
    private object Keys {
        val id = stringPreferencesKey(ID_KEY)
        val password = stringPreferencesKey(PASSWORD_KEY)
        val nickname = stringPreferencesKey(NICKNAME_KEY)
    }

    val userInfo: Flow<UserInfo> = context.localDataStore.data
        .catch {
            if (it is IOException) {
                emit(emptyPreferences())
            } else {
                throw it
            }
        }
        .map { preferences ->
            UserInfo(
                id = preferences[Keys.id].orEmpty(),
                password = preferences[Keys.password].orEmpty(),
                nickname = preferences[Keys.nickname].orEmpty(),
            )
        }
        .distinctUntilChanged()

    suspend fun setUserInfo(userInfo: UserInfo) {
        context.localDataStore.edit { preferences ->
            preferences[Keys.id] = userInfo.id
            preferences[Keys.password] = userInfo.password
            preferences[Keys.nickname] = userInfo.nickname
        }
    }

    companion object {
        const val ID_KEY = "id_key"
        const val PASSWORD_KEY = "pw_key"
        const val NICKNAME_KEY = "nickname_key"
    }
}
