package com.simhwa.data.signin.repository

import com.simhwa.data.signin.model.UserInfoEntity

interface SignInRepository {
    suspend fun signInUser(user: UserInfoEntity): Boolean
}
