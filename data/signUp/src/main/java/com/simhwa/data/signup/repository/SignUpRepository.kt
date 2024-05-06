package com.simhwa.data.signup.repository

import com.simhwa.data.local.model.UserInfo

interface SignUpRepository {
    suspend fun signUpUser(user: UserInfo)
}