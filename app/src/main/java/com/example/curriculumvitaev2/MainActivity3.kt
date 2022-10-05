package com.example.curriculumvitaev2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    lateinit var textFullName : TextView
    lateinit var textEmail : TextView
    lateinit var textAge : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        textFullName = findViewById<EditText>(R.id.editTextFullName)
        textEmail = findViewById<EditText>(R.id.editTextEmail)
        textAge = findViewById<EditText>(R.id.editTextAge)

        val fullName = intent.getStringExtra("fullName")
        val email = intent.getStringExtra("email")
        val age = intent.getStringExtra("age")

        textFullName.text = fullName
        textEmail.text = email
        textAge.text = age

    }
}