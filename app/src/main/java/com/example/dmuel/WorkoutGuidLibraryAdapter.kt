package com.example.dmuel

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView


class Guid(val guidList_icon: Int, val guidList_title: String, val guidList_add: Int)

class WorkoutGuidLibraryAdapter(val context: Context) : RecyclerView.Adapter<WorkoutGuidLibraryAdapter.ViewHolder>() {
    val guidList = arrayListOf(
        Guid(R.drawable.guidlist1, "숄더프레스", R.drawable.add),
        Guid(R.drawable.guidlist2, "레터럴레이즈", R.drawable.add),
        Guid(R.drawable.guidlist3, "벤치프레스", R.drawable.add),
        Guid(R.drawable.guidlist4, "레그익스텐션", R.drawable.add),
        Guid(R.drawable.guidlist5, "딥스", R.drawable.add),
        Guid(R.drawable.guidlist6, "풀업", R.drawable.add),
        Guid(R.drawable.guidlist7, "데드리프트", R.drawable.add),
        Guid(R.drawable.guidlist8, "바벨로우", R.drawable.add),
        Guid(R.drawable.guidlist9, "이두컬", R.drawable.add)
    )

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

        holder.itemView.setOnClickListener{
            Toast.makeText(context, guidList[position].guidList_title, Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int = guidList.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val guidList_icon = itemView.findViewById<ImageView>(R.id.guidList_icon)
        val guidList_title = itemView.findViewById<TextView>(R.id.guidList_title)
        val guidList_add = itemView.findViewById<ImageButton>(R.id.guidList_add)
    }
}

