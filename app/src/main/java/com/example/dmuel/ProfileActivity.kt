package com.example.dmuel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.dmuel.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {
    val binding by lazy { ActivityProfileBinding.inflate(layoutInflater) }

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
                    var intent = Intent(applicationContext, HomeActivity::class.java)
                    startActivity(intent)
                    true
                }

                R.id.tabcalendar -> {
                    var intent = Intent(applicationContext, CalendarAdapter::class.java)
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