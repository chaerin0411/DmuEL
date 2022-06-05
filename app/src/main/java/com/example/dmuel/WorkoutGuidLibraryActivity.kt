package com.example.dmuel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dmuel.databinding.ActivityWorkoutGuidLibraryBinding

class WorkoutGuidLibraryActivity : AppCompatActivity() {
    val binding by lazy { ActivityWorkoutGuidLibraryBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val adapter = WorkoutGuidLibraryAdapter(this)
        binding.guidRecyclerview.adapter = adapter
        binding.guidRecyclerview.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }
}
