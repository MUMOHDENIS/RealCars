package com.example.finalproject

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ListView
import android.widget.Toast
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class carsActivity : AppCompatActivity() {
    lateinit var mListCars:ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cars)
        mListCars = findViewById(R.id.mListCars)
        var cars:ArrayList<Ulpoad> = ArrayList()
        var myAdapter = CarsAdapter(applicationContext,cars)
        var progress = ProgressDialog(this)
        progress.setTitle("Loading")
        progress.setMessage("Please wait...")

        //Access the table in the database

        var my_db = FirebaseDatabase.getInstance().reference.child("Cars")
        //Start retrieving data
        progress.show()
        my_db.addValueEventListener(object: ValueEventListener {
            override fun onDataChange(p0: DataSnapshot) {
                //Get the data and put it on the arraylist users
                cars.clear()
                for (snap in p0.children){
                    var car = snap.getValue(Ulpoad::class.java)
                    cars.add(car!!)
                }
                //Notify the adapter that data has changed
                myAdapter.notifyDataSetChanged()
                progress.dismiss()
            }

            override fun onCancelled(p0: DatabaseError) {
                progress.dismiss()
                Toast.makeText(applicationContext,"DB Locked",Toast.LENGTH_LONG).show()
            }
        })

        mListCars.adapter = myAdapter
        mListCars.setOnItemClickListener { parent, view, position, id ->
            var intent = Intent(this,AddtocartActivity::class.java)
            var model: String = cars.get(position).model
            var color: String = cars.get(position).color
            var regNo: String = cars.get(position).regNo
            var price: String = cars.get(position).price
            var image: String = cars.get(position).image

            intent.putExtra("model",model)
            intent.putExtra("color",color)
            intent.putExtra("regNo",regNo)
            intent.putExtra("price",price)
            intent.putExtra("image",image)
            startActivity(intent)
        }


    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_add_cars -> {
                startActivity(Intent(this,AddcarsActivity::class.java))
                true
            }

            R.id.action_view_cars -> {
                Toast.makeText(this,"View cars clicked",Toast.LENGTH_LONG).show()
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }
}