package com.example.dmuel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dmuel.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {
    val binding by lazy { ActivityProfileBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnEditProfile.setOnClickListener {
            var intent = Intent(applicationContext, ProfileModifyActivity::class.java)
            startActivity(intent)
        }

    }
}