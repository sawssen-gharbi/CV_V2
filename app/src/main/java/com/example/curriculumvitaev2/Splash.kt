package com.example.curriculumvitaev2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

       val handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            val intent1 = Intent(this,MainActivity::class.java) // this heya ili ahna feha , mainactivity ili besh nemchiwelha
            startActivity(intent1)
            finish() // terja3 ili splash not home ken na3mloush finish
        },3000)
    }
}