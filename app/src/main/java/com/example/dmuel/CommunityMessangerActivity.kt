package com.example.dmuel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dmuel.databinding.ActivityCommunityMessangerBinding

class CommunityMessangerActivity : AppCompatActivity() {
    val binding by lazy { ActivityCommunityMessangerBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val adapter = CommunityMessangerAdapter(this)
        binding.messangeRecyclerview.adapter = adapter
        binding.messangeRecyclerview.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }
}