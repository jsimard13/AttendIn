package com.example.attendin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var btnstudent: Button
    private lateinit var btnprofessor: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnstudent = findViewById(R.id.btn_student)
        btnprofessor = findViewById(R.id.btn_professor)

        btnprofessor.setOnClickListener{
            val intent = Intent(this, StudentMain::class.java)
            startActivity(intent)
        }
        btnstudent.setOnClickListener{
            val intent = Intent(this, Professor::class.java)
            startActivity(intent)
        }


    }
}