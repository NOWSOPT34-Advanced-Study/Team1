package com.simhwa.mainPage

import android.os.Bundle
import com.example.mainpage.databinding.ActivityMainPageBinding
import com.simhwa.ui.base.BaseActivity

class MainPageActivity :
    BaseActivity<ActivityMainPageBinding>({ ActivityMainPageBinding.inflate(it) }) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}