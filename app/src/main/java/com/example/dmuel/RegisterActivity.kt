package com.example.dmuel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.util.Log
import android.widget.Toast
import com.example.dmuel.databinding.ActivityRegisterBinding
import java.util.regex.Pattern

class RegisterActivity : AppCompatActivity() {
    val binding by lazy { ActivityRegisterBinding.inflate(layoutInflater) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnHide.setOnClickListener {
            if(binding.btnHide.tag.equals(0)) {
                binding.btnHide.tag = 1
                binding.btnHide.setImageResource(R.drawable.ic_unhide)
                binding.editPw.transformationMethod = PasswordTransformationMethod.getInstance()
            } else {
                binding.btnHide.tag = 0
                binding.btnHide.setImageResource(R.drawable.ic_hide)
                binding.editPw.transformationMethod = HideReturnsTransformationMethod.getInstance()
            }
        }

        binding.btnHideAgain.setOnClickListener {
            if(binding.btnHideAgain.tag.equals(0)) {
                binding.btnHideAgain.tag = 1
                binding.btnHideAgain.setImageResource(R.drawable.ic_unhide)
                binding.editPwCheck.transformationMethod = PasswordTransformationMethod.getInstance()
            } else {
                binding.btnHideAgain.tag = 0
                binding.btnHideAgain.setImageResource(R.drawable.ic_hide)
                binding.editPwCheck.transformationMethod = HideReturnsTransformationMethod.getInstance()
            }
        }

        binding.registerButton.setOnClickListener {
            var editId = binding.editId.text.toString()
            var editPw = binding.editPw.text.toString()
            var editName = binding.editName.text.toString()
            var editNick = binding.editNick.text.toString()
            var editNumber = binding.editNumber.text.toString()

            var list = arrayListOf(editId, editPw, editName, editNick, editNumber)

            for (i in list.indices) {
                if (list[i].isEmpty()) {
                    Toast.makeText(applicationContext, "모두 입력해주시기 바랍니다.", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }
            }

            if (editPw != binding.editPwCheck.text.toString()) {
                Toast.makeText(applicationContext, "두 비밀번호가 일치하지 않습니다.", Toast.LENGTH_SHORT).show()
                binding.editPwCheck.requestFocus()
                return@setOnClickListener
            }

            if (!Pattern.matches("^[가-힣]*\$", editName)) {
                Toast.makeText(applicationContext, "올바른 이름 형식이 아닙니다.", Toast.LENGTH_SHORT).show()
                binding.editName.requestFocus()
                return@setOnClickListener
            }

            if(!Pattern.matches("^01(?:0|1|[6-9])(?:\\d{3}|\\d{4})\\d{4}$", editNumber)) {
                Toast.makeText(applicationContext, "올바른 전화번호가 아닙니다.", Toast.LENGTH_SHORT).show()
                binding.editNumber.requestFocus()
                return@setOnClickListener
            }

            var intent = Intent(applicationContext, GoalActivity1::class.java)
            startActivity(intent)
        }
    }
}