package com.example.homework5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homework5.databinding.ActivityRegister2Binding

class RegisterActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityRegister2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegister2Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnBack.setOnClickListener(){
            val intent = Intent(applicationContext,RegisterActivity::class.java)
            startActivity(intent)
        }

        binding.btnSingup.setOnClickListener(){

        }

    }
}