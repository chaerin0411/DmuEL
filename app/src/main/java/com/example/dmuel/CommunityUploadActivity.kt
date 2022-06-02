package com.example.dmuel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dmuel.databinding.ActivityCommunityUploadBinding

class CommunityUploadActivity : AppCompatActivity() {
    val binding by lazy { ActivityCommunityUploadBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.uploadButton.setOnClickListener {

        }
    }
}