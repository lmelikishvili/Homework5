package com.example.homework5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.homework5.databinding.ActivityRegister2Binding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.UserProfileChangeRequest

class RegisterActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityRegister2Binding
    private lateinit var firebaseAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegister2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()

        val intent = intent
        val email = intent.getStringExtra("email")
        val pass = intent.getStringExtra("pass")


        binding.btnBack.setOnClickListener(){
            val intent = Intent(applicationContext,RegisterActivity::class.java)
            startActivity(intent)
        }

        binding.btnSingup.setOnClickListener(){
            if (email != null) {
                if (pass != null) {

                    firebaseAuth
                        .createUserWithEmailAndPassword(email,pass)

                        .addOnCompleteListener(){
                            if (it.isSuccessful){
                                Toast.makeText(this, "Singup Success", Toast.LENGTH_SHORT).show()
                                val intent = Intent(applicationContext,DashboardActivity::class.java)
                                intent.putExtra("username", binding.etUsername.text.toString())
                                startActivity(intent)

                            }else{
                                Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT).show()
                            }
                        }

                }
            }else{
                Toast.makeText(this, "Emplty Fields Are Not Allowed !!", Toast.LENGTH_SHORT).show()
            }

        }

    }
}