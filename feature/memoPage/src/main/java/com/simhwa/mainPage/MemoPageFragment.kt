package com.simhwa.mainPage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.simhwa.mainPage.databinding.FragmentMemoPageBinding

class MemoPageFragment : Fragment() {
    private var _binding: FragmentMemoPageBinding? = null
    private val binding: FragmentMemoPageBinding
        get() = requireNotNull(_binding)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMemoPageBinding.inflate(inflater, container, false)
        return binding.root
    }
}