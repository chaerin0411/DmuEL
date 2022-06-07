package com.example.dmuel

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.example.dmuel.databinding.ActivityHomeBinding
import com.google.android.material.navigation.NavigationBarView
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*;



class HomeActivity : AppCompatActivity() {
    val binding by lazy { ActivityHomeBinding.inflate(layoutInflater) }
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        // 사용자 정보에서 캘린더 버튼 클릭 시, 캘린더 페이지로 이동

        binding.homeBtnCal.setOnClickListener {
            var intent = Intent(applicationContext, WorkoutRecordActivity::class.java)
            startActivity(intent)
        }



        // 하단탭에서 버튼 클릭 시, 해당 페이지로 이동

        binding.bottomNavigationView.setOnNavigationItemSelectedListener { item: MenuItem ->
            when(item.itemId) {
                R.id.tabhome -> {
                    var intent = Intent(applicationContext, HomeActivity::class.java)
                    startActivity(intent)
                    true
                }

                R.id.tabcalendar -> {
                    var intent = Intent(applicationContext, WorkoutRecordActivity::class.java)
                    startActivity(intent)
                    true
                }


                R.id.tabworkout -> {
                    var intent = Intent(applicationContext, WorkoutStartActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.tabcommunity -> {
                    var intent = Intent(applicationContext, CommunityActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.tabmypage -> {
                    var intent = Intent(applicationContext, ProfileActivity::class.java)
                    startActivity(intent)
                    true
                }
            }
            return@setOnNavigationItemSelectedListener false

        }



    }

    /*
    fun getCurrentDate(): String {
        /*
        var now = Date()
        var sFormat : SimpleDateFormat

        sFormat = SimpleDateFormat("E요일, MM/dd", Locale.getDefault())

        dayNow = sFormat.format(now)
        binding.homeDate.setText(daynow)


         */

        /*
        Calendar.getInstance().time.let { date ->
            SimpleDateFormat("E요일, MM월 dd일", Locale.getDefault()).let { simpleDateFormat ->
                return simpleDateFormat.format(date).toString()
            }
        }

         */

    }

     */

}


