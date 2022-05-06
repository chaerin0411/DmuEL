package com.example.dmuel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dmuel.databinding.ActivityOnboarding2Binding

class OnboardingActivity2 : AppCompatActivity() {
    val binding by lazy { ActivityOnboarding2Binding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.onboardingButton2.setOnClickListener {
            var intent = Intent(applicationContext, OnboardingActivity3::class.java)
            startActivity(intent)
        }
    }
}