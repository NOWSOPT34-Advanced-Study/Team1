package com.simhwa.signin

sealed class SignInSideEffect {
    data object NavigateToMain : SignInSideEffect()
    data object NavigateToSignUp : SignInSideEffect()
    data class SnackBar(val message: Int) : SignInSideEffect()
}
