package com.simhwa.team1

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.simhwa.team1.databinding.ActivityMainBinding
import com.simhwa.ui.base.BaseActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate) {
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initFragmentContainerView()
    }


    private fun initFragmentContainerView() {
        setContentView(binding.root)

        setNavigation()
    }

    private fun setNavigation() {
        setNavHost()
        setBottomClickListener()
        setBottomNavVisibity()
    }

    private fun setNavHost() {
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fcv_main) as NavHostFragment
        navController = navHostFragment.navController
        navController.graph.setStartDestination(com.simhwa.signin.R.id.navigation_graph_sign_in)
    }

    private fun setBottomClickListener() {
        binding.bnvMain.setOnItemSelectedListener { item ->
            NavigationUI.onNavDestinationSelected(item, navController)
            return@setOnItemSelectedListener true
        }
    }

    private fun setBottomNavVisibity() {
        navController.addOnDestinationChangedListener { _, destination, _ ->
            when (destination.id) {
                com.simhwa.mainPage.R.id.navigation_memo_page -> showBottomNav()
                com.simhwa.clippingpage.R.id.navigation_clipping_page -> showBottomNav()
                com.simhwa.searchpage.R.id.navigation_search_page -> showBottomNav()
                com.simhwa.mypage.R.id.navigation_my_page -> showBottomNav()
                else -> hideBottomNav()
            }
        }
    }

    private fun showBottomNav() {
        binding.bnvMain.visibility = View.VISIBLE
    }

    private fun hideBottomNav() {
        binding.bnvMain.visibility = View.INVISIBLE
    }
}
