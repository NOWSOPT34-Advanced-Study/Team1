package com.simhwa.data.signup.model

import com.simhwa.data.local.model.UserInfo

data class UserInfoEntity(
    val id: String,
    val password: String,
    val nickname: String,
) {
    fun toUserInfo(): UserInfo = UserInfo(id, password, nickname)
}