package com.example.dmuel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dmuel.databinding.ActivityOnboarding1Binding

class OnboardingActivity1 : AppCompatActivity() {
    val binding by lazy { ActivityOnboarding1Binding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.onboardingButton1.setOnClickListener {
            var intent = Intent(applicationContext, OnboardingActivity2::class.java)
            startActivity(intent)
        }
    }
}