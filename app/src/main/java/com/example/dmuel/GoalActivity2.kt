package com.example.dmuel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.dmuel.databinding.ActivityGoal2Binding

class GoalActivity2 : AppCompatActivity() {
    val binding by lazy { ActivityGoal2Binding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        var choiceGoal: View? = null
        var totalGoal = 0
        val goalMax = 1

        var choiceIntent = ""

        binding.goal1.setOnClickListener {
            if (totalGoal < goalMax) {
                if(binding.goal1.isSelected) {
                    choiceGoal = null
                    choiceGoal?.isSelected = false
                    totalGoal -= 1
                } else {
                    choiceGoal = binding.goal1
                    binding.goal1.isSelected = true
                    choiceIntent = "근력 증진"
                    totalGoal += 1
                }
            } else {
                if(binding.goal1.isSelected) {
                    choiceGoal = null
                    binding.goal1.isSelected = false
                    totalGoal -= 1
                } else {
                    choiceGoal?.isSelected = false
                    choiceGoal = binding.goal1
                    binding.goal1.isSelected = true
                    choiceIntent = "근력 증진"
                }
            }
        }

        binding.goal2.setOnClickListener {
            if (totalGoal < goalMax) {
                if(binding.goal2.isSelected) {
                    choiceGoal = null
                    choiceGoal?.isSelected = false
                    totalGoal -= 1
                } else {
                    choiceGoal = binding.goal2
                    binding.goal2.isSelected = true
                    choiceIntent = "체력 증진"
                    totalGoal += 1
                }
            } else {
                if(binding.goal2.isSelected) {
                    choiceGoal = null
                    binding.goal2.isSelected = false
                    totalGoal -= 1
                } else {
                    choiceGoal?.isSelected = false
                    choiceGoal = binding.goal2
                    binding.goal2.isSelected = true
                    choiceIntent = "체력 증진"
                }
            }
        }

        binding.goal3.setOnClickListener {
            if (totalGoal < goalMax) {
                if(binding.goal3.isSelected) {
                    choiceGoal = null
                    choiceGoal?.isSelected = false
                    totalGoal -= 1
                } else {
                    choiceGoal = binding.goal3
                    binding.goal3.isSelected = true
                    choiceIntent = "다이어트"
                    totalGoal += 1
                }
            } else {
                if(binding.goal3.isSelected) {
                    choiceGoal = null
                    binding.goal3.isSelected = false
                    totalGoal -= 1
                } else {
                    choiceGoal?.isSelected = false
                    choiceGoal = binding.goal3
                    binding.goal3.isSelected = true
                    choiceIntent = "다이어트"
                }
            }
        }

        binding.confirmButton1.setOnClickListener {
            if(totalGoal == 1) {
                var intent = Intent(applicationContext, GoalActivity3::class.java)
                intent.putExtra("목적", choiceIntent)
                startActivity(intent)
            }
        }
    }
}