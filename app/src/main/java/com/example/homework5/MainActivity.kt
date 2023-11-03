package com.example.homework5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homework5.databinding.ActivityLoginBinding
import com.example.homework5.databinding.ActivityMainBinding
import com.google.firebase.auth.FirebaseAuth


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var firebaseAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.btnRegister.setOnClickListener {
            setContentView(R.layout.activity_register)
        }

        binding.btnLogin.setOnClickListener {
            setContentView(R.layout.activity_login)
        }
    }
}