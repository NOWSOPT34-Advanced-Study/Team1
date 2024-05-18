package com.simhwa.mypage

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.simhwa.data.mainpage.model.User
import com.simhwa.data.mainpage.repository.MainPageRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MyPageViewModel @Inject constructor(private val repository: MainPageRepository) :
    ViewModel() {

    fun updateUserInfo(user: User) {
        viewModelScope.launch {
            repository.updateUserInfo(user)
        }
    }
}