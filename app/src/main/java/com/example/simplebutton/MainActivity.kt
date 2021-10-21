package com.example.simplebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var welcomeText: TextView
    lateinit var kotlinBtn: Button
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        welcomeText = findViewById(R.id.welcomeText)
        kotlinBtn = findViewById(R.id.kotlinBtn)


        kotlinBtn.setOnClickListener {
            Toast.makeText(
                applicationContext,
                "It is a Kotlin implementation!!!", Toast.LENGTH_LONG
            ).show()
        }
    }
        fun fromXML(view: android.view.View) {
            Toast.makeText(applicationContext, "It is a XML implementation!!!", Toast.LENGTH_SHORT).show()
        }
}