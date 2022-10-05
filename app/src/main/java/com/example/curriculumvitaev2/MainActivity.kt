package com.example.curriculumvitaev2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonClick : Button = findViewById(R.id.button)





        buttonClick.setOnClickListener {
            //val intent = Intent(this, MainActivity2::class.java)

            val fullName = findViewById<EditText>(R.id.editTextFullName).text.toString()
            val email = findViewById<EditText>(R.id.editTextEmail).text.toString()
            val age = findViewById<EditText>(R.id.editTextAge).text.toString().toInt()

            startActivity(Intent(this,MainActivity3::class.java).
            putExtra("fullName",fullName)
                .putExtra("email",email)
                .putExtra("age",age))


            }


        }
    }
