package com.simhwa.data.mainpage.model

import com.simhwa.data.local.model.UserInfo

data class User(
    val id: String,
    val password: String,
    val nickname: String,
)

fun UserInfo.toUser() = User(
    id = this.id,
    password = this.password,
    nickname = this.nickname
)

fun User.toUserInfo() = UserInfo(
    id = this.id,
    password = this.password,
    nickname = this.nickname
)