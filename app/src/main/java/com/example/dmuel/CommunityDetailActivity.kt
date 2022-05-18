package com.example.dmuel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dmuel.databinding.ActivityCommunityDetailBinding

class CommunityDetailActivity : AppCompatActivity() {
    val binding by lazy { ActivityCommunityDetailBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

    }
}