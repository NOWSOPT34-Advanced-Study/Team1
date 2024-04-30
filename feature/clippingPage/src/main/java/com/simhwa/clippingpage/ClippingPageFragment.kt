package com.simhwa.clippingpage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.simhwa.clippingpage.databinding.FragmentClippingPageBinding
import com.simhwa.ui.base.BaseFragment


class ClippingPageFragment : BaseFragment<FragmentClippingPageBinding>() {
    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
    ): FragmentClippingPageBinding = FragmentClippingPageBinding.inflate(inflater, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Do Something
    }
}
