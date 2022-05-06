package com.example.dmuel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dmuel.databinding.ActivityOnboarding3Binding

class OnboardingActivity3 : AppCompatActivity() {
    val binding by lazy { ActivityOnboarding3Binding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.startButton.setOnClickListener {
            var intent = Intent(applicationContext,LoginActivity::class.java)
            startActivity(intent)
        }
    }
}