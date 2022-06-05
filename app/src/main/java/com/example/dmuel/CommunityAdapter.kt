package com.example.dmuel

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class Community(
    val userProfile: Int,
    val userName: String,
    val uploadTime: String,
    val feedImage: Int,
    val favoriteButton: Int,
    val commentButton: Int,
    val messangerButton: Int,
    val favoriteCount: String,
    val commentCount: String,
    val feedContent: String
    )

class CommunityAdapter(val context: Context) : RecyclerView.Adapter<CommunityAdapter.ViewHolder>() {
    val communityList = arrayListOf(
        Community(R.drawable.user, "사용자", "2022-06-04", R.drawable.feed_image, R.drawable.favorite, R.drawable.comment, R.drawable.messanger, "회원님 외 1,532명이 좋아합니다", "댓글 32개 모두 보기", "오운완\n오늘의 운동 루틴과 식단 공유합니다."),
        Community(R.drawable.user, "사용자", "2022-06-04", R.drawable.feed_image, R.drawable.favorite, R.drawable.comment, R.drawable.messanger, "회원님 외 1,532명이 좋아합니다", "댓글 32개 모두 보기", "오운완\n오늘의 운동 루틴과 식단 공유합니다."),
        Community(R.drawable.user, "사용자", "2022-06-04", R.drawable.feed_image, R.drawable.favorite, R.drawable.comment, R.drawable.messanger, "회원님 외 1,532명이 좋아합니다", "댓글 32개 모두 보기", "오운완\n오늘의 운동 루틴과 식단 공유합니다."),
        Community(R.drawable.user, "사용자", "2022-06-04", R.drawable.feed_image, R.drawable.favorite, R.drawable.comment, R.drawable.messanger, "회원님 외 1,532명이 좋아합니다", "댓글 32개 모두 보기", "오운완\n오늘의 운동 루틴과 식단 공유합니다."),
        Community(R.drawable.user, "사용자", "2022-06-04", R.drawable.feed_image, R.drawable.favorite, R.drawable.comment, R.drawable.messanger, "회원님 외 1,532명이 좋아합니다", "댓글 32개 모두 보기", "오운완\n오늘의 운동 루틴과 식단 공유합니다."),
        Community(R.drawable.user, "사용자", "2022-06-04", R.drawable.feed_image, R.drawable.favorite, R.drawable.comment, R.drawable.messanger, "회원님 외 1,532명이 좋아합니다", "댓글 32개 모두 보기", "오운완\n오늘의 운동 루틴과 식단 공유합니다."),
        Community(R.drawable.user, "사용자", "2022-06-04", R.drawable.feed_image, R.drawable.favorite, R.drawable.comment, R.drawable.messanger, "회원님 외 1,532명이 좋아합니다", "댓글 32개 모두 보기", "오운완\n오늘의 운동 루틴과 식단 공유합니다."),
        Community(R.drawable.user, "사용자", "2022-06-04", R.drawable.feed_image, R.drawable.favorite, R.drawable.comment, R.drawable.messanger, "회원님 외 1,532명이 좋아합니다", "댓글 32개 모두 보기", "오운완\n오늘의 운동 루틴과 식단 공유합니다."),
        Community(R.drawable.user, "사용자", "2022-06-04", R.drawable.feed_image, R.drawable.favorite, R.drawable.comment, R.drawable.messanger, "회원님 외 1,532명이 좋아합니다", "댓글 32개 모두 보기", "오운완\n오늘의 운동 루틴과 식단 공유합니다."),
        Community(R.drawable.user, "사용자", "2022-06-04", R.drawable.feed_image, R.drawable.favorite, R.drawable.comment, R.drawable.messanger, "회원님 외 1,532명이 좋아합니다", "댓글 32개 모두 보기", "오운완\n오늘의 운동 루틴과 식단 공유합니다.")
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflatedView =
            LayoutInflater.from(parent.context).inflate(R.layout.community_item_view, parent, false)
        return ViewHolder(inflatedView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val curData = communityList[position]
        holder.userProfile.setImageResource(curData.userProfile)
        holder.userName.text = curData.userName
        holder.uploadTime.text = curData.uploadTime
        holder.feedImage.setImageResource(curData.feedImage)
        holder.favoriteButton.setImageResource(curData.favoriteButton)
        holder.commentButton.setImageResource(curData.commentButton)
        holder.messangerButton.setImageResource(curData.messangerButton)
        holder.favoriteCount.text = curData.favoriteCount
        holder.commentCount.text = curData.commentCount
        holder.feedContent.text = curData.feedContent

        holder.itemView.setOnClickListener{
            Toast.makeText(context, communityList[position].userName, Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int = communityList.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val userProfile = itemView.findViewById<ImageView>(R.id.userProfile)
        val userName = itemView.findViewById<TextView>(R.id.userName)
        val uploadTime = itemView.findViewById<TextView>(R.id.uploadTime)
        val feedImage = itemView.findViewById<ImageView>(R.id.feedImage)
        val favoriteButton = itemView.findViewById<ImageView>(R.id.favoriteButton)
        val commentButton = itemView.findViewById<ImageView>(R.id.commentButton)
        val messangerButton = itemView.findViewById<ImageView>(R.id.messangerButton)
        val favoriteCount = itemView.findViewById<TextView>(R.id.favoriteCount)
        val commentCount = itemView.findViewById<TextView>(R.id.commentCount)
        val feedContent = itemView.findViewById<TextView>(R.id.feedContent)
    }
}

