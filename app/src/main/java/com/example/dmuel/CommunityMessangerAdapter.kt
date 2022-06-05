package com.example.dmuel

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class Messanger(
    val userProfile: Int,
    val userName: String,
    val messangerContent: String,
    val sendTime: String
    )

class CommunityMessangerAdapter(val context: Context) : RecyclerView.Adapter<CommunityMessangerAdapter.ViewHolder>() {
    val messangerList = arrayListOf(
        Messanger(R.drawable.user, "사용자", "오늘도 운동 화이팅!", "35분 전"),
        Messanger(R.drawable.user, "사용자", "오늘도 운동 화이팅!", "35분 전"),
        Messanger(R.drawable.user, "사용자", "오늘도 운동 화이팅!", "35분 전"),
        Messanger(R.drawable.user, "사용자", "오늘도 운동 화이팅!", "35분 전"),
        Messanger(R.drawable.user, "사용자", "오늘도 운동 화이팅!", "35분 전"),
        Messanger(R.drawable.user, "사용자", "오늘도 운동 화이팅!", "35분 전"),
        Messanger(R.drawable.user, "사용자", "오늘도 운동 화이팅!", "35분 전"),
        Messanger(R.drawable.user, "사용자", "오늘도 운동 화이팅!", "35분 전"),
        Messanger(R.drawable.user, "사용자", "오늘도 운동 화이팅!", "35분 전"),
        Messanger(R.drawable.user, "사용자", "오늘도 운동 화이팅!", "35분 전")
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflatedView =
            LayoutInflater.from(parent.context).inflate(R.layout.messanger_item_view, parent, false)
        return ViewHolder(inflatedView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val curData = messangerList[position]
        holder.userProfile.setImageResource(curData.userProfile)
        holder.userName.text = curData.userName
        holder.messangerContent.text = curData.messangerContent
        holder.sendTime.text = curData.sendTime

        holder.itemView.setOnClickListener{
            Toast.makeText(context, messangerList[position].userName, Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int = messangerList.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val userProfile = itemView.findViewById<ImageView>(R.id.userProfile)
        val userName = itemView.findViewById<TextView>(R.id.userName)
        val messangerContent = itemView.findViewById<TextView>(R.id.messangerContent)
        val sendTime = itemView.findViewById<TextView>(R.id.sendTime)
    }
}

