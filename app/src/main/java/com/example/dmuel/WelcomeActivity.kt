package com.example.dmuel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dmuel.databinding.ActivityWelcomeBinding

class WelcomeActivity : AppCompatActivity() {
    val binding by lazy { ActivityWelcomeBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.homeButton.setOnClickListener {
            var intent = Intent(applicationContext, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}