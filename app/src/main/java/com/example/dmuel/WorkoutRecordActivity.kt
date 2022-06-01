package com.example.dmuel


import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.GridLayoutManager
import com.example.dmuel.databinding.ActivityWorkoutRecordBinding
import java.time.LocalDate
import java.time.YearMonth
import java.time.format.DateTimeFormatter

@RequiresApi(Build.VERSION_CODES.O)
class WorkoutRecordActivity : AppCompatActivity() {
    val binding by lazy { ActivityWorkoutRecordBinding.inflate(layoutInflater) }

    private lateinit var selectedDate: LocalDate
    private lateinit var CalendarAdapter: CalendarAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        selectedDate = LocalDate.now()

        setMonthView()

        binding.btnPrev.setOnClickListener {
            selectedDate = selectedDate.minusMonths(1)
            setMonthView()
        }

        binding.btnNext.setOnClickListener {
            selectedDate = selectedDate.plusMonths(1)
            setMonthView()
        }

        binding.btnArrow.setOnClickListener {
            var versionArray = arrayOf("운동1", "운동2", "운동3")
            var dlg = AlertDialog.Builder(this)
            dlg.setTitle("단계를 선택해주세요")
            dlg.setNegativeButton("취소", null)

            dlg.setItems(versionArray) { _, which ->
                binding.workoutDetail.text = versionArray[which]
                binding.workoutDetailText.text = versionArray[which]
            }
            dlg.show()
        }
    }

    // 형식 변환
    private fun monthYearFromDate(date: LocalDate): String {
        var formatter = DateTimeFormatter.ofPattern("yyyy년 M월")
        return date.format(formatter)
    }

    // 날짜 적용(화면 갱신)
    private fun setMonthView() {
        binding.todayDate.text = monthYearFromDate(selectedDate)

        var dayList = daysInMonthArray(selectedDate)

        CalendarAdapter = CalendarAdapter(dayList)
        binding.recyclerView.adapter = CalendarAdapter
        binding.recyclerView.layoutManager = GridLayoutManager(this, 7)
    }

    // 요일 설정
    private fun daysInMonthArray(date: LocalDate): ArrayList<String> {
        var dayList = ArrayList<String>()

        var yearMonth = YearMonth.from(date)
        var lastDay = yearMonth.lengthOfMonth()

        var firstDay = date.withDayOfMonth(1)
        var dayOfWeek = firstDay.dayOfWeek.value

        for(i in 1..41) {
            if (dayOfWeek == 7) {
                dayOfWeek = 0
            }
            if (i <= dayOfWeek || i > lastDay + dayOfWeek) {
                dayList.add("")
            } else {
                dayList.add((i-dayOfWeek).toString())
            }
        }
        return dayList
    }
}