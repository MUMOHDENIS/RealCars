package com.example.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var mtextmain: TextView
    lateinit var btnget: Button
    lateinit var btncom: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mtextmain = findViewById(R.id.textmain)
        btnget = findViewById(R.id.btnGetstarted)
        btncom = findViewById(R.id.mtvbuttonCom)
        btnget.setOnClickListener {
            val intent = Intent(this@MainActivity, RegisterActivity::class.java)
            startActivity(intent)
        }
        btncom.setOnClickListener {
            val intent = Intent(this@MainActivity, communicate::class.java)
            startActivity(intent)
        }
    }
}