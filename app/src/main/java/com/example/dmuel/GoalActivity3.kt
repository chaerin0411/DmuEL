package com.example.dmuel

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.dmuel.databinding.ActivityGoal3Binding

class GoalActivity3 : AppCompatActivity() {
    val binding by lazy { ActivityGoal3Binding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        var choiceText : TextView? = null
        var choiceTextValue : TextView? = null
        var choiceBtn : ImageButton? = null

        var list = arrayListOf(
            binding.textMon, binding.textTue,
            binding.textWed, binding.textThu,
            binding.textFri, binding.textSat,
            binding.textSun
        )

        var listValue = arrayListOf(
            binding.textMonValue, binding.textTueValue,
            binding.textWedValue, binding.textThuValue,
            binding.textFriValue, binding.textSatValue,
            binding.textSunValue
        )

        var intent = intent
        binding.textGoal.text = intent.getStringExtra("목적")

        binding.textMon.setOnClickListener {
            binding.textMon.setTextColor(Color.parseColor("#00F0FF"))
            choiceBtn?.isSelected = false
            if (choiceText != null && choiceText != binding.textMon) {
                choiceText?.setTextColor(Color.BLACK)
            }
            choiceText = binding.textMon
            choiceTextValue = binding.textMonValue
        }

        binding.textTue.setOnClickListener {
            binding.textTue.setTextColor(Color.parseColor("#00F0FF"))
            choiceBtn?.isSelected = false
            if (choiceText != null && choiceText != binding.textTue) {
                choiceText?.setTextColor(Color.BLACK)
            }
            choiceText = binding.textTue
            choiceTextValue = binding.textTueValue
        }

        binding.textWed.setOnClickListener {
            binding.textWed.setTextColor(Color.parseColor("#00F0FF"))
            choiceBtn?.isSelected = false
            if (choiceText != null && choiceText != binding.textWed) {
                choiceText?.setTextColor(Color.BLACK)
            }
            choiceText = binding.textWed
            choiceTextValue = binding.textWedValue
        }

        binding.textThu.setOnClickListener {
            binding.textThu.setTextColor(Color.parseColor("#00F0FF"))
            choiceBtn?.isSelected = false
            if (choiceText != null && choiceText != binding.textThu) {
                choiceText?.setTextColor(Color.BLACK)
            }
            choiceText = binding.textThu
            choiceTextValue = binding.textThuValue
        }

        binding.textFri.setOnClickListener {
            binding.textFri.setTextColor(Color.parseColor("#00F0FF"))
            choiceBtn?.isSelected = false
            if (choiceText != null && choiceText != binding.textFri) {
                choiceText?.setTextColor(Color.BLACK)
            }
            choiceText = binding.textFri
            choiceTextValue = binding.textFriValue
        }

        binding.textSat.setOnClickListener {
            binding.textSat.setTextColor(Color.parseColor("#00F0FF"))
            choiceBtn?.isSelected = false
            if (choiceText != null && choiceText != binding.textSat) {
                choiceText?.setTextColor(Color.BLACK)
            }
            choiceText = binding.textSat
            choiceTextValue = binding.textSatValue
        }

        binding.textSun.setOnClickListener {
            binding.textSun.setTextColor(Color.parseColor("#00F0FF"))
            choiceBtn?.isSelected = false
            if (choiceText != null && choiceText != binding.textSun) {
                choiceText?.setTextColor(Color.BLACK)
            }
            choiceText = binding.textSun
            choiceTextValue = binding.textSunValue
        }

        binding.btnShoulder.setOnClickListener {
            if(choiceText != null) {
                binding.btnShoulder.isSelected = true
                if (choiceBtn != null && choiceBtn != binding.btnShoulder) {
                    choiceBtn?.isSelected = false
                }
                choiceBtn = binding.btnShoulder
                choiceTextValue!!.text = "어깨"
            } else {
                Toast.makeText(applicationContext, "요일을 먼저 선택해주세요", Toast.LENGTH_SHORT).show()
            }
        }

        binding.btnLeg.setOnClickListener {
            if(choiceText != null) {
                binding.btnLeg.isSelected = true
                if (choiceBtn != null && choiceBtn != binding.btnLeg) {
                    choiceBtn?.isSelected = false
                }
                choiceBtn = binding.btnLeg
                choiceTextValue!!.text = "하체"
            } else {
                Toast.makeText(applicationContext, "요일을 먼저 선택해주세요", Toast.LENGTH_SHORT).show()
            }
        }

        binding.btnFoot.setOnClickListener {
            if(choiceText != null) {
                binding.btnFoot.isSelected = true
                if (choiceBtn != null && choiceBtn != binding.btnFoot) {
                    choiceBtn?.isSelected = false
                }
                choiceBtn = binding.btnFoot
                choiceTextValue!!.text = "유산소"
            } else {
                Toast.makeText(applicationContext, "요일을 먼저 선택해주세요", Toast.LENGTH_SHORT).show()
            }
        }

        binding.btnBack.setOnClickListener {
            if(choiceText != null) {
                binding.btnBack.isSelected = true
                if (choiceBtn != null && choiceBtn != binding.btnBack) {
                    choiceBtn?.isSelected = false
                }
                choiceBtn = binding.btnBack
                choiceTextValue!!.text = "등"
            } else {
                Toast.makeText(applicationContext, "요일을 먼저 선택해주세요", Toast.LENGTH_SHORT).show()
            }
        }

        binding.btnIdu.setOnClickListener {
            if(choiceText != null) {
                binding.btnIdu.isSelected = true
                if (choiceBtn != null && choiceBtn != binding.btnIdu) {
                    choiceBtn?.isSelected = false
                }
                choiceBtn = binding.btnIdu
                choiceTextValue!!.text = "이두"
            } else {
                Toast.makeText(applicationContext, "요일을 먼저 선택해주세요", Toast.LENGTH_SHORT).show()
            }
        }

        binding.btnRest.setOnClickListener {
            if(choiceText != null) {
                binding.btnRest.isSelected = true
                if (choiceBtn != null && choiceBtn != binding.btnRest) {
                    choiceBtn?.isSelected = false
                }
                choiceBtn = binding.btnRest
                choiceTextValue!!.text = ""
            } else {
                Toast.makeText(applicationContext, "요일을 먼저 선택해주세요", Toast.LENGTH_SHORT).show()
            }
        }

        binding.textStep.setOnClickListener {
            var versionArray = arrayOf("초급", "중급", "고급")
            var dlg = AlertDialog.Builder(this)
            dlg.setTitle("단계를 선택해주세요")
            dlg.setPositiveButton("등록", null)
            dlg.setNegativeButton("취소", null)

            dlg.setItems(versionArray) { _, which ->
                binding.textStep.text = versionArray[which]
            }
            dlg.show()
        }

        binding.confirmButton1.setOnClickListener {
            for(i in list.indices) {
                if(listValue[i].text == "선택") {
                    var value = list[i].text.toString()
                    Toast.makeText(applicationContext, value + "요일도 선택해주세요.", Toast.LENGTH_SHORT).show()
                    list[i].performClick()
                    return@setOnClickListener
                }
            }
            var intent = Intent(applicationContext, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}