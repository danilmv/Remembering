package com.andriod.remembering

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.andriod.remembering.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        supportFragmentManager
            .beginTransaction()
            .replace(binding.frame.id, ListFragment())
            .commit()
    }
}