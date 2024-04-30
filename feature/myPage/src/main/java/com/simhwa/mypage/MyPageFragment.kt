package com.simhwa.mypage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.simhwa.mypage.databinding.FragmentMyPageBinding
import com.simhwa.ui.base.BaseFragment

class MyPageFragment : BaseFragment<FragmentMyPageBinding>() {
    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
    ): FragmentMyPageBinding = FragmentMyPageBinding.inflate(inflater, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Do Something
    }
}
