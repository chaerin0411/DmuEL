package com.example.dmuel

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
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

class CommunityAdapter(private val communityList: ArrayList<Community>) : RecyclerView.Adapter<CommunityAdapter.ViewHolder>() {

    // 커스텀 리스너 인터페이스 정의
    interface OnItemClickListener {
        fun onItemClick(v: Community, position: Int)
    }

    // 리스너 객체를 전달하는 메서드와 전달된 객체를 저장할 변수 추가
    // 리스너 객체 참조를 저장하는 변수
    private var mListener: CommunityAdapter.OnItemClickListener? = null

    // OnItemClickListener 리스너 객체 참조를 어댑터에 전달하는 메서드
    fun setOnItemClickListener(listener: CommunityAdapter.OnItemClickListener) {
        this.mListener = listener
    }

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

        holder.favoriteButton.setOnClickListener {
            holder.favoriteButton.setImageResource(R.drawable.favorite_full)
            holder.favoriteCount.text = curData.favoriteCount + 1
        }

        val listener = View.OnClickListener { it ->
            if(position!= RecyclerView.NO_POSITION)
            {
                mListener?.onItemClick(curData, position)
            }
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

