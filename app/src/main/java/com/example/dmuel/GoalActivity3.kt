package com.example.dmuel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.dmuel.databinding.ActivityGoal3Binding

class GoalActivity3 : AppCompatActivity() {
    val binding by lazy { ActivityGoal3Binding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.textStep.setOnClickListener {
            var versionArray = arrayOf("초급", "중급", "고급")
            var dlg = AlertDialog.Builder(this)
            dlg.setTitle("단계를 선택해주세요")
            dlg.setPositiveButton("등록", null)
            dlg.setNegativeButton("취소", null)

            dlg.setItems(versionArray) { _, which ->
                binding.textStep.text = versionArray[which]
            }
            dlg.show()
        }

        binding.confirmButton1.setOnClickListener {
            var intent = Intent(applicationContext, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}