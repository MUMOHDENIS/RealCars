package com.example.finalproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class paymentActivity : AppCompatActivity() {
    lateinit var dtvview:TextView
    lateinit var rvimageview:ImageView
    lateinit var mbtnmpesa:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)
        dtvview = findViewById(R.id.mtvmpesaview)
        rvimageview = findViewById(R.id.mtvimageview)
        mbtnmpesa = findViewById(R.id.btnmpesaa)


        mbtnmpesa.setOnClickListener {
                val simToolKitLaunchIntent = applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                simToolKitLaunchIntent?.let { startActivity(it) }
            }
    }
}