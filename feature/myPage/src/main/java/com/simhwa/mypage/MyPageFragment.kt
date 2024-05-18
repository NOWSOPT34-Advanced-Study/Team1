package com.simhwa.mypage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.simhwa.data.mainpage.model.User
import com.simhwa.mypage.databinding.FragmentMyPageBinding
import com.simhwa.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MyPageFragment : BaseFragment<FragmentMyPageBinding>() {
    private val myPageViewModel by viewModels<MyPageViewModel>()

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
    ): FragmentMyPageBinding = FragmentMyPageBinding.inflate(inflater, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initUpdateNicknameBtnClickListener()
    }

    private fun initUpdateNicknameBtnClickListener() {
        binding.btUpdateNickname.setOnClickListener {
            updateUserInfo()
        }
    }

    private fun updateUserInfo() {
        myPageViewModel.updateUserInfo(with(binding) {
            User(
                etUpdateId.text.toString(),
                etUpdatePassword.text.toString(),
                etUpdateNickname.text.toString()
            )
        })
    }
}
