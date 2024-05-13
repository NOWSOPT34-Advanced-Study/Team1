package com.simhwa.data.mainpage.repository

import com.simhwa.data.mainpage.model.User

interface MainPageRepository {
    suspend fun mainPageUSer(): User
    suspend fun updateUserInfo(user: User)
}