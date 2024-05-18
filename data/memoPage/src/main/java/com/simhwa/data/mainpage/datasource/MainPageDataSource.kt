package com.simhwa.data.mainpage.datasource

import com.simhwa.data.mainpage.model.User

interface MainPageDataSource {
    suspend fun mainPageUSer(): User
    suspend fun updateUserInfo(user: User)
}