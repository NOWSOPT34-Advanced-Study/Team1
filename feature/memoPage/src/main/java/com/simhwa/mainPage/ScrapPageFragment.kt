package com.simhwa.mainPage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.simhwa.mainPage.databinding.FragmentScrapPageBinding

class ScrapPageFragment : Fragment() {
    private var _binding: FragmentScrapPageBinding? = null
    private val binding: FragmentScrapPageBinding
        get() = requireNotNull(_binding)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentScrapPageBinding.inflate(inflater, container, false)
        return binding.root
    }
}