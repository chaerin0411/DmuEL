package com.example.dmuel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dmuel.databinding.ActivityWorkoutProjectBinding

class WorkoutProjectActivity : AppCompatActivity() {
    val binding by lazy { ActivityWorkoutProjectBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.addButton.setOnClickListener {

        }

        binding.startButton.setOnClickListener {
            var intent = Intent(applicationContext, WorkoutStartActivity::class.java)
            startActivity(intent)
        }
    }
}