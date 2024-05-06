package com.simhwa.data.signup.repository

import com.simhwa.data.local.model.UserInfo
import com.simhwa.data.signup.datasource.SignUpDataSource
import javax.inject.Inject

class SignUpRepository @Inject constructor(private val signUpDataSource: SignUpDataSource) {

    suspend fun signUpUser(user: UserInfo) {
        runCatching {
            signUpDataSource.signUpUser(user)
        }
    }
}