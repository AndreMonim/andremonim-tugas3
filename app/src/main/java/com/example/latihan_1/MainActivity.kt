package com.example.latihan_1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.latihan_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.login.setOnClickListener {
            startActivity(Intent(this, dasboard::class.java))
        }

        binding.tvbelumpunyaakun.setOnClickListener {
            startActivity(Intent(this, Register::class.java))
        }

        binding.lupapassword.setOnClickListener {
            startActivity(Intent(this, Forgot_Password::class.java))
        }
    }
}
