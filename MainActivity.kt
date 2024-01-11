package com.example.tp4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableLayout
import com.example.tp4.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = ViewPagerAdapter(supportFragmentManager)

        adapter.addFragment(OutroFragment(), "OUTRO")
        adapter.addFragment(BasicoFragment(), "Basico")
        /*
        adapter.addFragment()*/
        binding.viewPager.adapter = adapter
        binding.tab.setupWithViewPager(binding.viewPager)
    }
}