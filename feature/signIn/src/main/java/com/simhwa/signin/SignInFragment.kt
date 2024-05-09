package com.simhwa.signin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.net.toUri
import androidx.fragment.app.viewModels
import androidx.lifecycle.flowWithLifecycle
import androidx.lifecycle.lifecycleScope
import androidx.navigation.NavDeepLinkRequest
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import com.simhwa.data.signin.model.UserInfoEntity
import com.simhwa.signin.databinding.FragmentSignInBinding
import com.simhwa.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

@AndroidEntryPoint
class SignInFragment : BaseFragment<FragmentSignInBinding>() {
    private val signInViewModel by viewModels<SignInViewModel>()

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
    ): FragmentSignInBinding = FragmentSignInBinding.inflate(inflater, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        signInViewModel.sideEffect.flowWithLifecycle(lifecycle).onEach { sideEffect ->
            when (sideEffect) {
                SignInSideEffect.NavigateToMain -> {
                    val request = NavDeepLinkRequest.Builder
                        .fromUri("featureMemoPage://MemoPageFragment".toUri())
                        .build()
                    findNavController().navigate(
                        request, NavOptions.Builder()
                            .setPopUpTo(findNavController().graph.id, true)
                            .build()
                    )
                }

                SignInSideEffect.NavigateToSignUp -> {
                    val request = NavDeepLinkRequest.Builder
                        .fromUri("featureSignUp://SignUpFragment".toUri())
                        .build()
                    findNavController().navigate(request)
                }

                is SignInSideEffect.SnackBar -> Toast.makeText(
                    this.context,
                    getString(sideEffect.message),
                    Toast.LENGTH_SHORT
                ).show()
            }
        }.launchIn(lifecycleScope)

        initSignUpBtnClickListener()
        initSignInBtnClickListener()
    }


    private fun initSignUpBtnClickListener() {
        binding.btSignup.setOnClickListener {
            signInViewModel.navigateSignUp()
        }
    }

    private fun initSignInBtnClickListener() {
        binding.btSignin.setOnClickListener {
            signInViewModel.signInUser(with(binding) {
                UserInfoEntity(
                    etSignInId.text.toString(),
                    etSignInPw.text.toString(),
                    ""
                )
            })
        }
    }
}
