package com.simhwa.team1

import android.os.Bundle
import com.simhwa.team1.databinding.ActivityMainBinding
import com.simhwa.ui.base.BaseActivity

class MainActivity : BaseActivity<ActivityMainBinding>({ ActivityMainBinding.inflate(it) }) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)
    }
}
