package com.example.a4vistas

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class AutoCompleteActivity : AppCompatActivity() {

    private val presidents = arrayOf(
        "Piero Baldarrago",
        "José Luis Bustamante",
        "Zenón Noriega",
        "Manuel Odría",
        "Manuel Prado",
        "Francisco Morales Bermúdez",
        "Fernando Belaúnde",
        "Alberto Fujimori",
        "Valentín Paniagua",
        "Alejandro Toledo",
        "Alan García",
        "Pedro Pablo Kuczynski",
        "Martín Vizcarra",
        "Pedro Castillo",
        "Dina Boluarte"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_auto_complete)

        val txtPresidentes = findViewById<AutoCompleteTextView>(R.id.txtPresidentes)

        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_dropdown_item_1line,
            presidents
        )

        txtPresidentes.threshold = 1

        txtPresidentes.setAdapter(adapter)

        val btnActividad1 = findViewById<TextView>(R.id.btnActividad1)
        val btnActividad2 = findViewById<TextView>(R.id.btnActividad2)
        val btnActividad3 = findViewById<TextView>(R.id.btnActividad3)

        btnActividad1.setOnClickListener {
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