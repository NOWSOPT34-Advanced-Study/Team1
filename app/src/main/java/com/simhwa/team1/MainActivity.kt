package com.simhwa.team1

import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.activity.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.flowWithLifecycle
import androidx.lifecycle.lifecycleScope
import com.simhwa.team1.databinding.ActivityMainBinding
import com.simhwa.ui.base.BaseActivity
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate) {
    private lateinit var navController: NavController
    private val viewModel: MainViewModel by viewModels()

  override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initFragmentContainerView()
    }


    private fun initFragmentContainerView() {
        setContentView(binding.root)
        
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fcv_main) as NavHostFragment
        navController = navHostFragment.navController
        navController.graph.setStartDestination(com.simhwa.signin.R.id.navigation_graph_sign_in)


//         // 예시를 위해서 만들어두었습니다.
//         lifecycleScope.launch {
//             viewModel.userInfo.flowWithLifecycle(lifecycle, Lifecycle.State.STARTED)
//                 .collect {
//                     binding.mainTvInfo.text = it.toString()
//                 }
//         }

//         // 한번만 해주면 데이터가 저장되어있어서 자동으로 화면에 넣어집니다
//         // viewModel.setUserInfo(UserInfo("id", "pw", "nickname"))
    }
}
