package com.simhwa.data.signup.datasource

import com.simhwa.data.local.datastore.LocalUserDataStore
import com.simhwa.data.local.model.UserInfo
import javax.inject.Inject

class SignUpDataSourceImpl @Inject constructor(private val localUserDataStore: LocalUserDataStore) :
    SignUpDataSource {

    override suspend fun signUpUser(user: UserInfo) {
        localUserDataStore.setUserInfo(user)
    }
}