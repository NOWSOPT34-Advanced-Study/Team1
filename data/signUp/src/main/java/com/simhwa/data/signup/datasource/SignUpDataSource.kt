package com.simhwa.data.signup.datasource

import com.simhwa.data.local.datastore.LocalUserDataStore
import com.simhwa.data.local.model.UserInfo
import javax.inject.Inject

class SignUpDataSource @Inject constructor(private val localUserDataStore: LocalUserDataStore) {

    suspend fun signUpUser(user: UserInfo) {
        localUserDataStore.setUserInfo(user)
    }
}