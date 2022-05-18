package com.example.wbintern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.wbintern.databinding.ActivityMusicConstraintBinding

class MusicConstraintActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMusicConstraintBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMusicConstraintBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textViewName.isSelected = true
        binding.textAlbum.isSelected = true
    }
}