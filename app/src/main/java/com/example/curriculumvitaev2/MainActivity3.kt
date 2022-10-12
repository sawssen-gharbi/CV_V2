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
        val textLang : TextView =  findViewById(R.id.textViewLanguage)
        val textHob : TextView =  findViewById(R.id.textViewHobby)


        val textAndroid : TextView = findViewById(R.id.textViewAndroid)
        val textIos : TextView = findViewById(R.id.textViewIos)
        val textFlutter : TextView = findViewById(R.id.textViewFlutter)


        val fullName = intent.getStringExtra("fullName")
        val email = intent.getStringExtra("email")
        val age = intent.getStringExtra("age")
        val gender = intent.getStringExtra("ch")

        val android = intent.getStringExtra("Android")
        val ios = intent.getStringExtra("iOS")
        val flutter = intent.getStringExtra("Flutter")

        val language = intent.getStringExtra("Language")
        val hobbies = intent.getStringExtra("Hobbies")



        textFullName.text = "Full name : " + fullName
        textEmail.text = "Email: " + email
        textAge.text = "Age : " + age
        textRadio.text = "Gender : " + gender
        textAndroid.text = "Android skill : " + android
        textIos.text = "Ios skill : " + ios
        textFlutter.text = "Flutter skill : " + flutter

        textLang.text = "Language : " + language
        textHob.text = "Hobby: " + hobbies




    }
}