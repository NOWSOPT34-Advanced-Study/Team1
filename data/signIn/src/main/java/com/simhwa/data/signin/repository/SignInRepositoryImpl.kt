package com.simhwa.data.signin.repository

import com.simhwa.data.local.datastore.LocalUserDataStore
import com.simhwa.data.signin.model.UserInfoEntity
import javax.inject.Inject

class SignInRepositoryImpl @Inject constructor(
    private val localUserDataStore: LocalUserDataStore,
) : SignInRepository {
    override suspend fun signInUser(user: UserInfoEntity): Boolean =
        localUserDataStore.canSignIn(user = user.toUserInfo())
}
