package com.simhwa.mypage

import android.os.Bundle
import com.simhwa.mypage.databinding.ActivityMyPageBinding
import com.simhwa.ui.base.BaseActivity

class MyPageActivity : BaseActivity<ActivityMyPageBinding>({ ActivityMyPageBinding.inflate(it) }) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)
    }
}
