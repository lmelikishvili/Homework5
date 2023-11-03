package com.example.homework5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatImageButton
import com.example.homework5.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        findViewById<AppCompatImageButton>(R.id.btn_back).setOnClickListener(){
            setContentView(R.layout.activity_main)
        }
        findViewById<AppCompatImageButton>(R.id.btn_next).setOnClickListener(){
            setContentView(R.layout.activity_main)
        }




    }
}