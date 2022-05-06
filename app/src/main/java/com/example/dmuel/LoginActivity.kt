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
            //var intent = Intent(applicationContext, LoginActivity::class.java)
            startActivity(intent)
        }

        binding.joinButton.setOnClickListener {
            var intent = Intent(applicationContext, JoinActivity::class.java)
            startActivity(intent)
        }
    }
}