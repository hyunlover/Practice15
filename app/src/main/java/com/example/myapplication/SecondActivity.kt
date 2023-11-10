package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val textView: TextView = findViewById(R.id.textView2)


        var Pets: Pets = Pets()
        val arguments: Bundle? = intent.extras
        if (arguments != null) {
            Pets =
                arguments.getParcelable<Pets>(Pets.javaClass.simpleName) as Pets
            textView.text =
                "Breed: ${Pets.getBreed()} \nYear:${Pets.getYear()} \nMonth: ${Pets.getMonth()}"
        }}
        }




