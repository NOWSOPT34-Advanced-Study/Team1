package com.simhwa.data.mainpage.repository

import com.simhwa.data.mainpage.datasource.MainPageDataSource
import com.simhwa.data.mainpage.model.User
import javax.inject.Inject

class MainPageRepositoryImpl @Inject constructor(private val mainPageDataSource: MainPageDataSource) :
    MainPageRepository {

    override suspend fun mainPageUSer(): Result<User> =
        runCatching {
            mainPageDataSource.mainPageUSer()
        }


    override suspend fun updateUserInfo(user: User) {
        runCatching {
            mainPageDataSource.updateUserInfo(user)
        }
    }
}