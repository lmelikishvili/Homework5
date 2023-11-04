package com.example.homework5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.os.IResultReceiver._Parcel
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatImageButton
import com.example.homework5.databinding.ActivityRegisterBinding
import com.google.android.material.textfield.TextInputLayout
import com.google.firebase.auth.FirebaseAuth

class RegisterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding
    private lateinit var firebaseAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()


        binding.btnBack.setOnClickListener(){
            val intent = Intent(applicationContext,MainActivity::class.java)
            startActivity(intent)
        }

        binding.btnNext.setOnClickListener(){
            val email = binding.etEmail.text.toString()
            val pass = binding.etPassw.text.toString()
            val intent = Intent(applicationContext,RegisterActivity2::class.java)
            intent.putExtra("email", email)
            intent.putExtra("pass", pass)
            startActivity(intent)



        }

    }
}