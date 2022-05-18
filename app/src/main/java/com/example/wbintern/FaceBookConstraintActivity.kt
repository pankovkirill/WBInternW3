package com.example.wbintern

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.wbintern.databinding.ActivityFaceBookConstraintBinding

class FaceBookConstraintActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFaceBookConstraintBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFaceBookConstraintBinding.inflate(layoutInflater)
        setContentView(binding.root)


//        binding.inputTextLogin.onFocusChangeListener =
//            View.OnFocusChangeListener { _, hasFocus ->
//                if (hasFocus) binding.inputTextLogin.hint = "" else binding.inputTextLogin.hint =
//                    getString(R.string.login_hint)
//            }

//        binding.inputTextPassword.onFocusChangeListener =
//            View.OnFocusChangeListener { _, hasFocus ->
//                if (hasFocus) binding.inputTextPassword.hint = "" else binding.inputTextPassword.hint =
//                    getString(R.string.password_hint)
//            }
    }
}