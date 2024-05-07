package com.simhwa.signup

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.net.toUri
import androidx.fragment.app.viewModels
import androidx.navigation.NavDeepLinkRequest
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import com.simhwa.data.signup.model.UserInfoEntity
import com.simhwa.signup.databinding.FragmentSignUpBinding
import com.simhwa.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SignUpFragment : BaseFragment<FragmentSignUpBinding>() {

    private val signUpViewModel by viewModels<SignUpViewModel>()

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentSignUpBinding = FragmentSignUpBinding.inflate(inflater, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initSignUpBtnClickListener()
    }

    private fun initSignUpBtnClickListener() {
        binding.btnSignUpSignup.setOnClickListener {
            setUserInfo()
            navigateToSignIn()
        }
    }

    private fun setUserInfo() {
        signUpViewModel.signUpUser(with(binding) {
            UserInfoEntity(
                etSignUpId.text.toString(),
                etSignUpPw.text.toString(),
                etSignUpNickname.text.toString()
            )
        })
    }

    private fun navigateToSignIn() {
        val request = NavDeepLinkRequest.Builder
            .fromUri("featureSignIn://SignInFragment".toUri())
            .build()

        findNavController().navigate(request)
    }
}