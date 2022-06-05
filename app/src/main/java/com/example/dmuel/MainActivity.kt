package com.example.dmuel

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
            var intent = Intent(applicationContext, WorkoutRecordActivity::class.java)
            startActivity(intent)
        }

        binding.guidButton1.setOnClickListener {
            var intent = Intent(applicationContext, WorkoutGuidActivity::class.java)
            startActivity(intent)
        }

        binding.guidButton2.setOnClickListener {
            var intent = Intent(applicationContext, WorkoutGuidLibraryActivity::class.java)
            startActivity(intent)
        }

        binding.guidButton3.setOnClickListener {
            var intent = Intent(applicationContext, WorkoutProjectActivity::class.java)
            startActivity(intent)
        }

        binding.guidButton4.setOnClickListener {
            var intent = Intent(applicationContext, WorkoutDetailActivity::class.java)
            startActivity(intent)
        }

        binding.photoButton.setOnClickListener {
            var intent = Intent(applicationContext, WorkoutStartActivity::class.java)
            startActivity(intent)
        }

        binding.communityButton1.setOnClickListener {
            var intent = Intent(applicationContext, CommunityActivity::class.java)
            startActivity(intent)
        }

        binding.communityButton2.setOnClickListener {
            var intent = Intent(applicationContext, CommunityCommentActivity::class.java)
            startActivity(intent)
        }

        binding.communityButton3.setOnClickListener {
            var intent = Intent(applicationContext, CommunityUploadActivity::class.java)
            startActivity(intent)
        }

        binding.communityButton4.setOnClickListener {
            var intent = Intent(applicationContext, CommunityMessangerActivity::class.java)
            startActivity(intent)
        }

        binding.profileButton.setOnClickListener {
            var intent = Intent(applicationContext, ProfileActivity::class.java)
            startActivity(intent)
        }

    }
}