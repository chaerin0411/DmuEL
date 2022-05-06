package com.example.dmuel

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dmuel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy { ActivityMainBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.recordButton.setOnClickListener {
            var intent = Intent(applicationContext, RecordActivity::class.java)
            startActivity(intent)
        }

        binding.guidButton.setOnClickListener {
            var intent = Intent(applicationContext, GuidLibraryActivity::class.java)
            startActivity(intent)
        }

        binding.photoButton.setOnClickListener {
            var intent = Intent(applicationContext, WorkoutStartActivity::class.java)
            startActivity(intent)
        }

        binding.communityButton.setOnClickListener {
            var intent = Intent(applicationContext, WorkoutDetailActivity::class.java)
            startActivity(intent)
        }

        binding.profileButton.setOnClickListener {
            var intent = Intent(applicationContext, WorkoutProjectActivity::class.java)
            startActivity(intent)
        }

    }
}