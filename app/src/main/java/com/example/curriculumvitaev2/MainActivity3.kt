package com.example.curriculumvitaev2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    lateinit var textFullName : TextView
    lateinit var textEmail : TextView
    lateinit var textAge : TextView
    lateinit var textRadio : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        textFullName = findViewById(R.id.textViewFullName)
        textEmail = findViewById(R.id.textViewEmail)
        textAge = findViewById(R.id.textViewAge)

        textRadio = findViewById(R.id.textViewGender)


        val fullName = intent.getStringExtra("fullName")
        val email = intent.getStringExtra("email")
        val age = intent.getStringExtra("age")

        val gender = intent.getStringExtra("ch")





        textFullName.text = "Full name : " + fullName
        textEmail.text = "Email: " + email
        textAge.text = "Age : " + age
        textRadio.text = "Gender : " + gender





    }
}