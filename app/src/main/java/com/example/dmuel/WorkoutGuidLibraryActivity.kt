package com.example.dmuel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dmuel.databinding.ActivityWorkoutGuidLibraryBinding

class WorkoutGuidLibraryActivity : AppCompatActivity() {
    val binding by lazy { ActivityWorkoutGuidLibraryBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

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

        binding.generateButton.setOnClickListener {
            var intent = Intent(applicationContext, WorkoutProjectActivity::class.java)
            startActivity(intent)
        }

        // guidRecyclerview에 WorkoutGuidLibraryAdapter 객체 지정
        val adapter = WorkoutGuidLibraryAdapter(guidList)
        binding.guidRecyclerview.adapter = adapter

        // 인터페이스로 구현된 이벤트를 처리
        adapter.setOnItemClickListener(object : WorkoutGuidLibraryAdapter.OnItemClickListener {
            override fun onItemClick(v: Community, position: Int) {
                TODO("Not yet implemented")
            }

            override fun onItemClick(data: Guid, pos: Int) {
                Toast.makeText(applicationContext, "IfCall Clicked -> Name : ${data.guidList_title}", Toast.LENGTH_SHORT).show()
                binding.addWorkout.text = "${binding.addWorkout.text}, ${data.guidList_title}"
            }
        })

        // guidRecyclerview에 LinearLayoutManager 객체 지정
        binding.guidRecyclerview.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }
}
