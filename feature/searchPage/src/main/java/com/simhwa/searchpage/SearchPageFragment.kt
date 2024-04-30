package com.simhwa.searchpage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.simhwa.searchpage.databinding.FragmentSearchPageBinding
import com.simhwa.ui.base.BaseFragment

class SearchPageFragment : BaseFragment<FragmentSearchPageBinding>() {
    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
    ): FragmentSearchPageBinding = FragmentSearchPageBinding.inflate(inflater, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Do Something
    }
}
