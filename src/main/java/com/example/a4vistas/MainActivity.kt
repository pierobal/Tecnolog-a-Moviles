package com.example.a4vistas

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnActividad1 = findViewById<TextView>(R.id.btnActividad1)
        val btnActividad2 = findViewById<TextView>(R.id.btnActividad2)
        val btnActividad3 = findViewById<TextView>(R.id.btnActividad3)

        btnActividad1.setOnClickListener {
            val intent = Intent(this, AutoCompleteActivity::class.java)
            startActivity(intent)
        }

        btnActividad2.setOnClickListener {
            val intent = Intent(this, TimePickerActivity::class.java)
            startActivity(intent)
        }

        btnActividad3.setOnClickListener {
            val intent = Intent(this, DatePickerActivity::class.java)
            startActivity(intent)
        }
    }
}