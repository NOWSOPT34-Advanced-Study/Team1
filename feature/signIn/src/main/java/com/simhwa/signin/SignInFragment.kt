package com.simhwa.signin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.net.toUri
import androidx.fragment.app.Fragment
import androidx.navigation.NavDeepLinkRequest
import androidx.navigation.fragment.findNavController
import com.simhwa.signin.databinding.FragmentSignInBinding

class SignInFragment : Fragment() {
    private var _binding: FragmentSignInBinding? = null
    private val binding: FragmentSignInBinding
        get() = requireNotNull(_binding)


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSignInBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initSignUpBtnClickListener()
        initSignInBtnClickListener()
    }

    fun initSignUpBtnClickListener() {
        binding.btSignup.setOnClickListener {
            val request = NavDeepLinkRequest.Builder
                .fromUri("featureSignUp://SignUpFragment".toUri())
                .build()
            findNavController().navigate(request)
        }
    }

    fun initSignInBtnClickListener() {
        binding.btSignin.setOnClickListener {
            val request = NavDeepLinkRequest.Builder
                .fromUri("featureMainPage://MainPageFragment".toUri())
                .build()
            findNavController().navigate(request)
        }
    }

}