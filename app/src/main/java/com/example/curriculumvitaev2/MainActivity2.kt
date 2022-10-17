package com.example.curriculumvitaev2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.SeekBar

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val button: Button = findViewById(R.id.buttonSubmit)
        val androidSkill = findViewById<SeekBar>(R.id.seekBar2)
        val iosSkill = findViewById<SeekBar>(R.id.seekBar3)
        val flutterSkill = findViewById<SeekBar>(R.id.seekBar4)

        val music = findViewById<CheckBox>(R.id.checkBoxMusic)
        val sport = findViewById<CheckBox>(R.id.checkBoxSport)
        val games = findViewById<CheckBox>(R.id.checkBoxGames)

        val arabe = findViewById<CheckBox>(R.id.checkBoxArabic)
        val francais = findViewById<CheckBox>(R.id.checkBoxFrench)
        val anglais = findViewById<CheckBox>(R.id.checkBoxEnglish)






        val fullName = intent.getStringExtra("fullName")
        val email = intent.getStringExtra("email")
        val age = intent.getStringExtra("age")
        val gender = intent.getStringExtra("ch")

        button.setOnClickListener {

            val language = when {
                arabe.isChecked && francais.isChecked && anglais.isChecked -> "Arabic French English"
                arabe.isChecked && francais.isChecked -> "Arabic French"
                arabe.isChecked && anglais.isChecked -> "Arabic English"
                francais.isChecked && anglais.isChecked -> "French English"
                arabe.isChecked -> "Arabic"
                francais.isChecked -> "French"
                anglais.isChecked -> "English"

                else -> "None"
            }
            val hobby = when {
                music.isChecked && sport.isChecked && games.isChecked -> "Music Sport Games"
                sport.isChecked && games.isChecked -> "Sport Games"
                sport.isChecked && music.isChecked -> "Sport Music"
                games.isChecked && music.isChecked -> "Games Music"
                games.isChecked -> "Games"
                sport.isChecked -> "Sport"
                music.isChecked -> "Music"
                else -> "None"
            }

            startActivity(


                Intent(this,MainActivity4::class.java)
                    .putExtra("Android", androidSkill.progress.toString())
                    .putExtra("iOS", iosSkill.progress.toString())
                    .putExtra("Flutter", flutterSkill.progress.toString())
                    .putExtra("fullName",fullName)
                    .putExtra("email",email)
                    .putExtra("age",age)
                    .putExtra("ch",gender)
                    .putExtra("Language", language)
                    .putExtra("Hobbies", hobby))

            finish()



        }


    }
}