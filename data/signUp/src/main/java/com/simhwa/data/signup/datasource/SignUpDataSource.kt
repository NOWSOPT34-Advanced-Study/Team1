package com.simhwa.data.signup.datasource

import com.simhwa.data.local.datastore.LocalUserDataStore
import com.simhwa.data.local.model.UserInfo
import javax.inject.Inject

interface SignUpDataSource{
    suspend fun signUpUser(user: UserInfo)
}