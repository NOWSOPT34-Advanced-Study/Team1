package com.simhwa.mainPage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.simhwa.mainPage.databinding.FragmentMemoPageBinding
import com.simhwa.ui.base.BaseFragment

class MemoPageFragment : BaseFragment<FragmentMemoPageBinding>() {
    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
    ): FragmentMemoPageBinding = FragmentMemoPageBinding.inflate(inflater, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Do Something
    }
}