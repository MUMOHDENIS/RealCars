package com.example.finalproject

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class communicate : AppCompatActivity() {
    lateinit var vbtnemail:Button
    lateinit var vbtnsms:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_communicate)
        vbtnemail= findViewById(R.id.btnemail)
        vbtnsms = findViewById(R.id.btnsms)
        vbtnemail.setOnClickListener {
            val emailIntent =
                Intent(Intent.ACTION_SENDTO, Uri.fromParts("MUMOH", "dmumo198@gmail.com", null))
            emailIntent.putExtra(Intent.EXTRA_TEXT, "Dear sir/madam i hearby inquire about purchasing a car")
            startActivity(Intent.createChooser(emailIntent, "Send email..."))
        }
        vbtnsms.setOnClickListener {
            val uri: Uri = Uri.parse("smsto:0706918506")
            val intent = Intent(Intent.ACTION_SENDTO, uri)
            intent.putExtra("sms_body", "Hello there,")
            startActivity(intent)
        }


    }
}