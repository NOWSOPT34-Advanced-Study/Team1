package com.simhwa.auth

import android.os.Bundle
import com.simhwa.auth.databinding.ActivityAuthBinding
import com.simhwa.ui.base.BaseActivity

class AuthActivity : BaseActivity<ActivityAuthBinding>({ ActivityAuthBinding.inflate(it) }) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)
    }
}
