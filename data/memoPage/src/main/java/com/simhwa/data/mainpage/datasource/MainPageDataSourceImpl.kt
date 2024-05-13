package com.simhwa.data.mainpage.datasource

import com.simhwa.data.local.datastore.LocalUserDataStore
import com.simhwa.data.mainpage.model.User
import com.simhwa.data.mainpage.model.toUser
import com.simhwa.data.mainpage.model.toUserInfo
import kotlinx.coroutines.flow.first
import javax.inject.Inject

class MainPageDataSourceImpl @Inject constructor(private val localUserDataStore: LocalUserDataStore) :
    MainPageDataSource {

    override suspend fun mainPageUSer() =
        localUserDataStore.userInfo.first().toUser()

    override suspend fun updateUserInfo(user: User) {
        localUserDataStore.setUserInfo(user.toUserInfo())
    }

}

