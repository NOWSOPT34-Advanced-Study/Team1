package com.simhwa.data.signup.repository

import com.simhwa.data.signup.datasource.SignUpDataSource
import com.simhwa.data.signup.model.UserInfoEntity
import javax.inject.Inject

class SignUpRepositoryImpl @Inject constructor(private val signUpDataSource: SignUpDataSource) :
    SignUpRepository {

    override suspend fun signUpUser(user: UserInfoEntity) {
        runCatching {
            signUpDataSource.signUpUser(user.toUserInfo())
        }
    }
}