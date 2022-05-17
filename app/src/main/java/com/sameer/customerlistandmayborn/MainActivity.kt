package com.sameer.customerlistandmayborn

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import com.google.android.material.tabs.TabLayout
import com.sameer.customerlistandmayborn.adapter.TabAdapter
import com.sameer.customerlistandmayborn.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var  binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        window.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)
        window.statusBarColor = Color.TRANSPARENT

        var tabAdapter = TabAdapter(applicationContext,supportFragmentManager,binding.tabLayout.tabCount)
        binding.vpCustomerList.adapter = tabAdapter

        binding.vpCustomerList.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(binding.tabLayout))
        binding.tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{

            override fun onTabSelected(tab: TabLayout.Tab?) {
                if (tab != null) {
                    binding.vpCustomerList.currentItem = tab.position
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }

        })
    }
}