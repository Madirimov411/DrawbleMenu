package com.uzb7.drawblemenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.GravityCompat
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.uzb7.drawblemenu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setupDrawerMenu()

    }

    private fun setupDrawerMenu() {
        binding.apply {
            ivMenu.setOnClickListener {
                drawerLayout.openDrawer(GravityCompat.START)
            }
            navigationView.itemIconTintList = null
            val navController =
                (supportFragmentManager.findFragmentById(R.id.navHostFragment) as NavHostFragment).navController
            NavigationUI.setupWithNavController(navigationView,navController)
        }
    }
}