package com.example.dmuel

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class Guid(val guidList_icon: Int, val guidList_title: String, val guidList_add: Int)

class WorkoutGuidLibraryAdapter(private val guidList: ArrayList<Guid>) : RecyclerView.Adapter<WorkoutGuidLibraryAdapter.ViewHolder>() {

    // 커스텀 리스너 인터페이스 정의
    interface OnItemClickListener {
        fun onItemClick(v: Community, position: Int)
        fun onItemClick(data: Guid, pos: Int)
    }

    // 리스너 객체를 전달하는 메서드와 전달된 객체를 저장할 변수 추가
    // 리스너 객체 참조를 저장하는 변수
    private var mListener: WorkoutGuidLibraryAdapter.OnItemClickListener? = null

    // OnItemClickListener 리스너 객체 참조를 어댑터에 전달하는 메서드
    fun setOnItemClickListener(listener: WorkoutGuidLibraryAdapter.OnItemClickListener) {
        this.mListener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflatedView =
            LayoutInflater.from(parent.context).inflate(R.layout.guid_item_view, parent, false)
        return ViewHolder(inflatedView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val curData = guidList[position]
        holder.guidList_icon.setImageResource(curData.guidList_icon)
        holder.guidList_title.text = curData.guidList_title
        holder.guidList_add.setImageResource(curData.guidList_add)

        val listener = View.OnClickListener { it ->
            if(position!= RecyclerView.NO_POSITION)
            {
                mListener?.onItemClick(curData, position)
            }
        }
    }

    override fun getItemCount(): Int = guidList.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val guidList_icon = itemView.findViewById<ImageView>(R.id.guidList_icon)
        val guidList_title = itemView.findViewById<TextView>(R.id.guidList_title)
        val guidList_add = itemView.findViewById<ImageButton>(R.id.guidList_add)
    }
}

