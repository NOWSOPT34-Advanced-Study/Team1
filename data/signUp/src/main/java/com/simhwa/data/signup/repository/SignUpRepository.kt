package com.simhwa.data.signup.repository

import com.simhwa.data.signup.model.UserInfoEntity


interface SignUpRepository {
    suspend fun signUpUser(user: UserInfoEntity)
}