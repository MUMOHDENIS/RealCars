package com.example.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import com.bumptech.glide.Glide

class AddtocartActivity : AppCompatActivity() {
    lateinit var carImage:ImageView
    lateinit var model : EditText
    lateinit var color: EditText
    lateinit var regno :EditText
    lateinit var price:EditText
    lateinit var btnpurchase:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_addtocart)
        model = findViewById(R.id.mtvedtname)
        color = findViewById(R.id.medtcolor)
        regno = findViewById(R.id.medtReg)
        price = findViewById(R.id.mtvpricee)
        carImage = findViewById(R.id.imageView)
        btnpurchase = findViewById(R.id.btnpurchase)





        btnpurchase.setOnClickListener {
            val intent = Intent(this@AddtocartActivity, paymentActivity::class.java)
            startActivity(intent)
        }


        var model = intent.getStringExtra("model")
        var color = intent.getStringExtra("color")
        var regNo = intent.getStringExtra("regNo")
        var price = intent.getStringExtra("price")
        var image = intent.getStringExtra("image")
        Glide.with(this).load(image).into(carImage)



    }
}