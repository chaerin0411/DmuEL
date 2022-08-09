package com.example.dmuel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dmuel.databinding.ActivityCommunityBinding

class CommunityActivity : AppCompatActivity() {
    val binding by lazy { ActivityCommunityBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val communityList = arrayListOf(
            Community(R.drawable.user, "사용자", "2022-06-04", R.drawable.feed_image, R.drawable.favorite, R.drawable.comment, R.drawable.messanger, "1,532명이 좋아합니다", "댓글 32개 모두 보기", "오운완\n오늘의 운동 루틴과 식단 공유합니다."),
            Community(R.drawable.user, "사용자", "2022-06-04", R.drawable.feed_image, R.drawable.favorite, R.drawable.comment, R.drawable.messanger, "1,532명이 좋아합니다", "댓글 32개 모두 보기", "오운완\n오늘의 운동 루틴과 식단 공유합니다."),
            Community(R.drawable.user, "사용자", "2022-06-04", R.drawable.feed_image, R.drawable.favorite, R.drawable.comment, R.drawable.messanger, "1,532명이 좋아합니다", "댓글 32개 모두 보기", "오운완\n오늘의 운동 루틴과 식단 공유합니다."),
            Community(R.drawable.user, "사용자", "2022-06-04", R.drawable.feed_image, R.drawable.favorite, R.drawable.comment, R.drawable.messanger, "1,532명이 좋아합니다", "댓글 32개 모두 보기", "오운완\n오늘의 운동 루틴과 식단 공유합니다."),
            Community(R.drawable.user, "사용자", "2022-06-04", R.drawable.feed_image, R.drawable.favorite, R.drawable.comment, R.drawable.messanger, "1,532명이 좋아합니다", "댓글 32개 모두 보기", "오운완\n오늘의 운동 루틴과 식단 공유합니다."),
            Community(R.drawable.user, "사용자", "2022-06-04", R.drawable.feed_image, R.drawable.favorite, R.drawable.comment, R.drawable.messanger, "1,532명이 좋아합니다", "댓글 32개 모두 보기", "오운완\n오늘의 운동 루틴과 식단 공유합니다."),
            Community(R.drawable.user, "사용자", "2022-06-04", R.drawable.feed_image, R.drawable.favorite, R.drawable.comment, R.drawable.messanger, "1,532명이 좋아합니다", "댓글 32개 모두 보기", "오운완\n오늘의 운동 루틴과 식단 공유합니다."),
            Community(R.drawable.user, "사용자", "2022-06-04", R.drawable.feed_image, R.drawable.favorite, R.drawable.comment, R.drawable.messanger, "1,532명이 좋아합니다", "댓글 32개 모두 보기", "오운완\n오늘의 운동 루틴과 식단 공유합니다."),
            Community(R.drawable.user, "사용자", "2022-06-04", R.drawable.feed_image, R.drawable.favorite, R.drawable.comment, R.drawable.messanger, "1,532명이 좋아합니다", "댓글 32개 모두 보기", "오운완\n오늘의 운동 루틴과 식단 공유합니다."),
            Community(R.drawable.user, "사용자", "2022-06-04", R.drawable.feed_image, R.drawable.favorite, R.drawable.comment, R.drawable.messanger, "1,532명이 좋아합니다", "댓글 32개 모두 보기", "오운완\n오늘의 운동 루틴과 식단 공유합니다.")
        )

        // communityRecyclerview에 WorkoutGuidLibraryAdapter 객체 지정
        val adapter = CommunityAdapter(communityList)
        binding.communityRecyclerview.adapter = adapter

        // 인터페이스로 구현된 이벤트를 처리
        adapter.setOnItemClickListener(object : CommunityAdapter.OnItemClickListener {
            override fun onItemClick(data: Community, pos: Int) {
                Toast.makeText(applicationContext, "IfCall Clicked -> Name : ${data.userName}", Toast.LENGTH_SHORT).show()


            }
        })

        // communityRecyclerview에 LinearLayoutManager 객체 지정
        binding.communityRecyclerview.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        binding.uploadButton.setOnClickListener {
            var intent = Intent(applicationContext, CommunityUploadActivity::class.java)
            startActivity(intent)
        }

        binding.messangerButton.setOnClickListener {
            var intent = Intent(applicationContext, CommunityMessangerActivity::class.java)
            startActivity(intent)
        }
    }
}