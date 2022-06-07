package com.example.dmuel

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.MenuItem
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.example.dmuel.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {
    val binding by lazy { ActivityProfileBinding.inflate(layoutInflater) }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnEditProfile.setOnClickListener {
            var intent = Intent(applicationContext, ProfileModifyActivity::class.java)
            startActivity(intent)
        }

        // 하단탭에서 버튼 클릭 시, 해당 페이지로 이동

        binding.bottomNavigationView.setOnNavigationItemSelectedListener { item: MenuItem ->
            when(item.itemId) {
                R.id.tabhome -> {
                    try {
                        // 액티비티 화면 재갱신 시키는 코드
                        val intent = intent
                        finish() //현재 액티비티 종료 실시
                        overridePendingTransition(0, 0) //인텐트 애니메이션 없애기
                        startActivity(intent) //현재 액티비티 재실행 실시
                        overridePendingTransition(0, 0) //인텐트 애니메이션 없애기
                    } catch (e: Exception) {
                        e.printStackTrace()
                    }
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

    }