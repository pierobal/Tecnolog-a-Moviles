package com.example.a4vistas



import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.TextView
import android.widget.TimePicker
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class DatePickerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_date_picker)

        val datePicker = findViewById<DatePicker>(R.id.datePicker)
        val timePicker = findViewById<TimePicker>(R.id.timePicker)
        val btnMostrarFechaHora = findViewById<Button>(R.id.btnMostrarFechaHora)
        timePicker.setIs24HourView(false)

        btnMostrarFechaHora.setOnClickListener {
            val dia = datePicker.dayOfMonth
            val mes = datePicker.month + 1
            val anio = datePicker.year

            val hora = timePicker.hour
            val minuto = String.format("%02d", timePicker.minute)

            Toast.makeText(
                this,
                "Fecha: $dia/$mes/$anio  Hora: $hora:$minuto",
                Toast.LENGTH_SHORT
            ).show()
        }

        val btnActividad1 = findViewById<TextView>(R.id.btnActividad1)
        val btnActividad2 = findViewById<TextView>(R.id.btnActividad2)
        val btnActividad3 = findViewById<TextView>(R.id.btnActividad3)

        btnActividad1.setOnClickListener {
            startActivity(Intent(this, AutoCompleteActivity::class.java))
        }

        btnActividad2.setOnClickListener {
            startActivity(Intent(this, TimePickerActivity::class.java))
        }

        btnActividad3.setOnClickListener {
            // Ya estás aquí
        }
    }
}