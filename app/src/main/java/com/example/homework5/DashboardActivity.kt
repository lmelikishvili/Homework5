package com.example.homework5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.homework5.databinding.ActivityDashboardBinding
import com.google.firebase.auth.FirebaseAuth

class DashboardActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDashboardBinding
    private lateinit var firebaseAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()


        val intent = intent
        val userName = intent.getStringExtra("username")
        val email = intent.getStringExtra("email")

        if (!userName.isNullOrEmpty()) {
            binding.etUsername.text = "Welcome $userName"
        }else{
            binding.etUsername.text = "Welcome $email"
        }

        binding.etUsername.setOnClickListener(){

            firebaseAuth.signOut()
            Toast.makeText(this, "Singout Success!!!", Toast.LENGTH_SHORT).show()
            val intent = Intent(applicationContext,MainActivity::class.java)
            startActivity(intent)
        }


    }
}