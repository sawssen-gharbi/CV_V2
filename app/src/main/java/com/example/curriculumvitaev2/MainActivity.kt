package com.example.curriculumvitaev2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
        lateinit var radiog : RadioGroup


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonClick : Button = findViewById(R.id.button)
        radiog = findViewById(R.id.radioGroup);





        buttonClick.setOnClickListener {
            //val intent = Intent(this, MainActivity2::class.java)

            val fullName = findViewById<EditText>(R.id.editTextFullName)
            val email = findViewById<EditText>(R.id.editTextEmail)
            val age = findViewById<EditText>(R.id.editTextAge)
            val ch = radiog.checkedRadioButtonId;
            val radioButton = findViewById<RadioButton>(ch);



            startActivity(Intent(this,MainActivity3::class.java)
                .putExtra("fullName",fullName.text.toString())
                .putExtra("email",email.text.toString())
                .putExtra("age",age.text.toString())
                .putExtra("ch",radioButton.text.toString()))

                    finish()


        }







            }


        }

