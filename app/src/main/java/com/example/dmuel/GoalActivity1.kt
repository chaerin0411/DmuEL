package com.example.dmuel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dmuel.databinding.ActivityGoal1Binding

class GoalActivity1 : AppCompatActivity() {
    val binding by lazy { ActivityGoal1Binding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.nextButton.setOnClickListener {
            var intent = Intent(applicationContext, GoalActivity2::class.java)
            startActivity(intent)
        }
    }
}