package com.simhwa.signup

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.simhwa.data.local.model.UserInfo
import com.simhwa.data.signup.repository.SignUpRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SignUpViewModel @Inject constructor(private val repository: SignUpRepository) : ViewModel() {

    fun signUpUser(user: UserInfo) {
        viewModelScope.launch {
            repository.signUpUser(
                user
            )
        }
    }
}