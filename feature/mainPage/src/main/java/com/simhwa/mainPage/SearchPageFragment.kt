package com.simhwa.mainPage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.simhwa.mainPage.databinding.FragmentSearchPageBinding

class SearchPageFragment : Fragment() {
    private var _binding: FragmentSearchPageBinding? = null
    private val binding: FragmentSearchPageBinding
        get() = requireNotNull(_binding)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSearchPageBinding.inflate(inflater, container, false)
        return binding.root
    }
}