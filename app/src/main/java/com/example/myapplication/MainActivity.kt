package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun ButtonOnClick(view: View) {
        val breedText: TextView = findViewById(R.id.editTextText)
        val yearText: TextView = findViewById(R.id.editTextText2)
        val monthText: TextView = findViewById(R.id.editTextText3)
        if (breedText.text.toString()==""){
            Toast.makeText(this,"У питомца нет породы ?",Toast.LENGTH_SHORT).show()
            breedText.requestFocus()
        } else if (yearText.text.toString()==""){
            Toast.makeText(this,"У вашего питомца нет года рождения ?",Toast.LENGTH_SHORT).show()
            yearText.requestFocus()
        } else if (monthText.text.toString()==""){
            Toast.makeText(this,"У вашего питомца  нет месяца рождения ?", Toast.LENGTH_SHORT).show()
            yearText.requestFocus()
        }
        val breed = breedText.text.toString()
        val year = yearText.text.toString().toInt()
        val month = monthText.text.toString().toInt()
        val Pets: Pets = Pets(breed, year, month)
        val intent: Intent = Intent(this@MainActivity, SecondActivity::class.java)
        intent.putExtra(Pets.javaClass.simpleName, Pets)
 startActivity(intent)
    }

}