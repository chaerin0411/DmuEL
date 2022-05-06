package com.example.dmuel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dmuel.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    val binding by lazy { ActivityLoginBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.loginButton.setOnClickListener {
            var intent = Intent(applicationContext, WelcomeActivity::class.java)
            startActivity(intent)
        }

        binding.registerButton.setOnClickListener {
            var intent = Intent(applicationContext, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}