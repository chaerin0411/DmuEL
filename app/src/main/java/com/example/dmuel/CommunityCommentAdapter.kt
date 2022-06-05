package com.example.dmuel

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class Comment(
    val userProfile: Int,
    val userName: String,
    val uploadTime: String,
    val commentContent: String,
    val reComment: String,
    val favoriteButton: Int
    )

class CommunityCommentAdapter(val context: Context) : RecyclerView.Adapter<CommunityCommentAdapter.ViewHolder>() {
    val commentList = arrayListOf(
        Comment(R.drawable.user, "사용자", "6시간 전", "운동 루틴이랑 식단 공유해주세요!", "답글 달기", R.drawable.favorite),
        Comment(R.drawable.user, "사용자", "6시간 전", "운동 루틴이랑 식단 공유해주세요!", "답글 달기", R.drawable.favorite),
        Comment(R.drawable.user, "사용자", "6시간 전", "운동 루틴이랑 식단 공유해주세요!", "답글 달기", R.drawable.favorite),
        Comment(R.drawable.user, "사용자", "6시간 전", "운동 루틴이랑 식단 공유해주세요!", "답글 달기", R.drawable.favorite),
        Comment(R.drawable.user, "사용자", "6시간 전", "운동 루틴이랑 식단 공유해주세요!", "답글 달기", R.drawable.favorite),
        Comment(R.drawable.user, "사용자", "6시간 전", "운동 루틴이랑 식단 공유해주세요!", "답글 달기", R.drawable.favorite),
        Comment(R.drawable.user, "사용자", "6시간 전", "운동 루틴이랑 식단 공유해주세요!", "답글 달기", R.drawable.favorite),
        Comment(R.drawable.user, "사용자", "6시간 전", "운동 루틴이랑 식단 공유해주세요!", "답글 달기", R.drawable.favorite),
        Comment(R.drawable.user, "사용자", "6시간 전", "운동 루틴이랑 식단 공유해주세요!", "답글 달기", R.drawable.favorite),
        Comment(R.drawable.user, "사용자", "6시간 전", "운동 루틴이랑 식단 공유해주세요!", "답글 달기", R.drawable.favorite)
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflatedView =
            LayoutInflater.from(parent.context).inflate(R.layout.comment_item_view, parent, false)
        return ViewHolder(inflatedView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val curData = commentList[position]
        holder.userProfile.setImageResource(curData.userProfile)
        holder.userName.text = curData.userName
        holder.uploadTime.text = curData.uploadTime
        holder.commentContent.text = curData.commentContent
        holder.reComment.text = curData.reComment
        holder.favoriteButton.setImageResource(curData.favoriteButton)

        holder.itemView.setOnClickListener{
            Toast.makeText(context, commentList[position].userName, Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int = commentList.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val userProfile = itemView.findViewById<ImageView>(R.id.userProfile)
        val userName = itemView.findViewById<TextView>(R.id.userName)
        val uploadTime = itemView.findViewById<TextView>(R.id.uploadTime)
        val commentContent = itemView.findViewById<TextView>(R.id.commentContent)
        val reComment = itemView.findViewById<TextView>(R.id.reComment)
        val favoriteButton = itemView.findViewById<ImageView>(R.id.favoriteButton)
    }
}

