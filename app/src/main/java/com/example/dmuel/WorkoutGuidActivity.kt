package com.example.dmuel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dmuel.databinding.ActivityWorkoutGuidBinding

class WorkoutGuidActivity : AppCompatActivity() {
    val binding by lazy { ActivityWorkoutGuidBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.recommendedButton.setOnClickListener {

        }

        binding.customButton.setOnClickListener {
            var intent = Intent(applicationContext, WorkoutGuidLibraryActivity::class.java)
            startActivity(intent)
        }


    }
}