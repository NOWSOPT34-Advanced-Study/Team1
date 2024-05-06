package com.simhwa.signup

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.net.toUri
import androidx.navigation.NavDeepLinkRequest
import androidx.navigation.fragment.findNavController
import com.simhwa.signup.databinding.FragmentSignUpBinding
import com.simhwa.ui.base.BaseFragment

class SignUpFragment : BaseFragment<FragmentSignUpBinding>() {
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
            val request = NavDeepLinkRequest.Builder
                .fromUri("featureSignIn://SignInFragment".toUri())
                .build()
            findNavController().navigate(request)
        }
    }
}





