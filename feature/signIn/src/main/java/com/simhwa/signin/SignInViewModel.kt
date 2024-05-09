package com.simhwa.signin

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.simhwa.data.signin.model.UserInfoEntity
import com.simhwa.data.signin.repository.SignInRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SignInViewModel @Inject constructor(
    private val repository: SignInRepository,
) : ViewModel() {
    private val _sideEffect: MutableSharedFlow<SignInSideEffect> = MutableSharedFlow()
    val sideEffect: SharedFlow<SignInSideEffect>
        get() = _sideEffect.asSharedFlow()

    fun signInUser(user: UserInfoEntity) {
        viewModelScope.launch {
            val canSignIn = repository.signInUser(
                user
            )

            if (canSignIn) {
                _sideEffect.emit(SignInSideEffect.NavigateToMain)
            } else {
                _sideEffect.emit(SignInSideEffect.SnackBar(R.string.sign_in_error))
            }
        }
    }

    fun navigateSignUp() {
        viewModelScope.launch {
            _sideEffect.emit(SignInSideEffect.NavigateToSignUp)
        }
    }
}
