package com.example.dmuel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dmuel.databinding.ActivityCommunityCommentBinding

class CommunityCommentActivity : AppCompatActivity() {
    val binding by lazy { ActivityCommunityCommentBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.commentSendButton.setOnClickListener {

        }

        val adapter = CommunityCommentAdapter(this)
        binding.commentRecyclerview.adapter = adapter
        binding.commentRecyclerview.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }
}