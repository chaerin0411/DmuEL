package com.example.dmuel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
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
            var intent = Intent(applicationContext, CommunityMessangerActivity::class.java)
            startActivity(intent)
        }

        val adapter = CommunityAdapter(this)
        binding.communityRecyclerview.adapter = adapter
        binding.communityRecyclerview.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }
}