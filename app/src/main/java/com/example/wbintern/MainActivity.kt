package com.example.wbintern

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.wbintern.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        buttonClick()
    }

    private fun buttonClick() {
        with(binding) {
            btnConstraintCalculator.setOnClickListener {
                startActivity(Intent(this@MainActivity, СalculatorConstraintActivity::class.java))
            }
            btnConstraintTelegram.setOnClickListener {
                startActivity(Intent(this@MainActivity, TelegramConstraintActivity::class.java))
            }
            btnConstraintMusic.setOnClickListener {
                startActivity(Intent(this@MainActivity, MusicConstraintActivity::class.java))
            }
            btnConstraintFacebook.setOnClickListener {
                startActivity(Intent(this@MainActivity, FaceBookConstraintActivity::class.java))
            }

            btnCalculator.setOnClickListener {
                startActivity(Intent(this@MainActivity, CalculatorActivity::class.java))
            }
            btnTelegram.setOnClickListener {
                startActivity(Intent(this@MainActivity, TelegramActivity::class.java))
            }
            btnMusic.setOnClickListener {
                startActivity(Intent(this@MainActivity, MusicActivity::class.java))
            }
            btnFacebook.setOnClickListener {
                startActivity(Intent(this@MainActivity, FaceBookActivity::class.java))
            }
        }
    }
}