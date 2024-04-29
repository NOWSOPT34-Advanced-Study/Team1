package com.simhwa.mainPage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mainPage.databinding.FragmentMainPageBinding

class MainPageFragment : Fragment() {
    private var _binding: FragmentMainPageBinding? = null
    private val binding: FragmentMainPageBinding
        get() = requireNotNull(_binding)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainPageBinding.inflate(inflater, container, false)
        return binding.root
    }
}