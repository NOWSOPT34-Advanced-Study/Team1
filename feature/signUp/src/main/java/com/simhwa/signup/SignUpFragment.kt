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
import com.simhwa.data.local.model.UserInfo
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

            val request = NavDeepLinkRequest.Builder
                .fromUri("featureSignIn://SignInFragment".toUri())
                .build()

            val navOptions = NavOptions.Builder()
                .setPopUpTo(findNavController().graph.startDestinationId, true)
                .build()

            findNavController().navigate(request, navOptions)
        }
    }

    private fun setUserInfo() {
        signUpViewModel.signUpUser(with(binding) {
            UserInfo(
                etSignUpId.text.toString(),
                etSignUpPw.text.toString(),
                etSignUpNickname.text.toString()
            )
        })
    }
}