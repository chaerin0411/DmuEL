package com.example.dmuel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dmuel.databinding.ActivityCommunityBinding

class CommunityActivity : AppCompatActivity() {
    val binding by lazy { ActivityCommunityBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.uploadButton.setOnClickListener {
            var intent = Intent(applicationContext, CommunityUploadActivity::class.java)
            startActivity(intent)
        }

        binding.favoriteButton.setOnClickListener {

        }

        binding.messangerButton.setOnClickListener {
            var intent = Intent(applicationContext, CommunityMessageActivity::class.java)
            startActivity(intent)
        }
    }
}