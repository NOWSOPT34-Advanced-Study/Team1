package com.simhwa.team1

import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.simhwa.team1.databinding.ActivityMainBinding
import com.simhwa.ui.base.BaseActivity

class MainActivity : BaseActivity<ActivityMainBinding>({ ActivityMainBinding.inflate(it) }) {
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initFragmentContainerView()
    }

    private fun initFragmentContainerView() {
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fcv_main) as NavHostFragment
        navController = navHostFragment.navController
        navController.graph.setStartDestination(com.simhwa.signin.R.id.navigation_graph_sign_in)
    }
}
