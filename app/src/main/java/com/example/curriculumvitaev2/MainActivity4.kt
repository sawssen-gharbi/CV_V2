package com.example.curriculumvitaev2

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.curriculumvitaev2.databinding.ActivityMain2Binding
import com.example.curriculumvitaev2.databinding.ActivityMainBinding

class MainActivity4   : AppCompatActivity() {
    lateinit var textFullName : TextView
    lateinit var textEmail : TextView
    lateinit var buttonSkills: Button
    lateinit var buttonLan: Button
    lateinit var buttonHobby: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        textFullName = findViewById(R.id.textViewName)
        textEmail = findViewById(R.id.textViewEmailAdd)

        val fullName = intent.getStringExtra("fullName")
        val email = intent.getStringExtra("email")

        textFullName.text = "Full name : " + fullName
        textEmail.text = "Email: " + email

        //buttons
        buttonSkills = findViewById(R.id.buttonSkills)
        buttonLan = findViewById(R.id.buttonLang)
        buttonHobby = findViewById(R.id.buttonHobb)

        //fragments
        val f1 = FragmentSkills()
        val f2 = FragmentHobby()
        val f3 = FragmentLang()


        buttonSkills.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragment , f1)
                addToBackStack(null)
                commit()
            }
        }

        buttonLan.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragment , f2)
                addToBackStack(null)
                commit()
            }
        }

        buttonHobby.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragment , f3)
                addToBackStack(null)
                commit()
            }
        }



    }
}