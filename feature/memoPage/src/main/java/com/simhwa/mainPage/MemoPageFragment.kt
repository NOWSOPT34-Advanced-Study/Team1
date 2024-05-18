package com.simhwa.mainPage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.simhwa.mainPage.databinding.FragmentMemoPageBinding
import com.simhwa.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MemoPageFragment : BaseFragment<FragmentMemoPageBinding>() {
    private val memoPageViewModel by viewModels<MemoPageViewModel>()

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
    ): FragmentMemoPageBinding = FragmentMemoPageBinding.inflate(inflater, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        memoPageViewModel.getUserInfo()
        userInfoObserver()
    }

    private fun userInfoObserver() {
        memoPageViewModel.userInfo.observe(viewLifecycleOwner) {
            binding.memoId.text = it.id
            binding.memoPassword.text = it.password
            binding.memoNickname.text = it.nickname
        }
    }
}