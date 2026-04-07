package com.example.a4vistas


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.TimePicker
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class TimePickerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_time_picker)

        val timePicker = findViewById<TimePicker>(R.id.timePicker)
        val btnMostrarHora = findViewById<Button>(R.id.btnMostrarHora)

        timePicker.setIs24HourView(false)

        btnMostrarHora.setOnClickListener {
            val hora = timePicker.hour
            val minuto = timePicker.minute
            Toast.makeText(this, "Hora seleccionada: $hora:$minuto", Toast.LENGTH_SHORT).show()
        }

        val btnActividad1 = findViewById<TextView>(R.id.btnActividad1)
        val btnActividad2 = findViewById<TextView>(R.id.btnActividad2)
        val btnActividad3 = findViewById<TextView>(R.id.btnActividad3)

        btnActividad1.setOnClickListener {
            startActivity(Intent(this, AutoCompleteActivity::class.java))
        }

        btnActividad2.setOnClickListener {
        }

        btnActividad3.setOnClickListener {
            startActivity(Intent(this, DatePickerActivity::class.java))
        }
    }
}