package com.example.dmuel

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dmuel.databinding.ActivityProfileModifyBinding
import java.util.*

class ProfileModifyActivity : AppCompatActivity() {

    val binding by lazy { ActivityProfileModifyBinding.inflate(layoutInflater) }
    var dateString = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnDate.setOnClickListener {
            val cal = Calendar.getInstance() //캘린더뷰 만들기
            val dateSetListener = DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
                dateString = "${year}년 ${month+1}월 ${dayOfMonth}일"
                binding.resultDate.text = dateString

            }
            // dialog 창 띄우기
            DatePickerDialog(this, dateSetListener, cal.get(Calendar.YEAR), cal.get(Calendar.MONTH),
                cal.get(Calendar.DAY_OF_MONTH)).show()

        }


    }
}