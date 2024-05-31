package com.example.functionapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val angka = findViewById<EditText>(R.id.inputAngka)
        val cekBtn = findViewById<Button>(R.id.cekBtn)

        cekBtn.setOnClickListener {
            cekGanjilGenap(angka.text.toString().toInt())
        }
    }

    fun cekGanjilGenap(angka: Int) {
        if (angka%2 == 0) {
            Toast.makeText( this,"Bilangan Genap", Toast.LENGTH_SHORT).show()
        }   else {
            Toast.makeText( this,"Bilangan Ganjil", Toast.LENGTH_SHORT).show()
        }
    }
}