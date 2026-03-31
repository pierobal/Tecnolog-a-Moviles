package com.example.a3prog_actividades

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private val TAG = "Bienvenidos"
    private lateinit var progressBar: ProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnMostrar = findViewById<Button>(R.id.btnMostrar)
        val btnConversion = findViewById<Button>(R.id.btnConversion)
        val btnDrawer = findViewById<Button>(R.id.btnDrawer)
        progressBar = findViewById(R.id.progressBar)

        btnMostrar.setOnClickListener {
            mostrarCargaYIr(SegundaActividad::class.java)
        }

        btnConversion.setOnClickListener {
            mostrarCargaYIr(ConversionMonedaActivity::class.java)
        }

        btnDrawer.setOnClickListener {
            mostrarCargaYIr(NavigationDrawerActivity::class.java)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        Log.d(TAG, "En el evento onCreate()")
    }

    private fun mostrarCargaYIr(destino: Class<*>) {
        progressBar.visibility = View.VISIBLE

        Handler(Looper.getMainLooper()).postDelayed({
            progressBar.visibility = View.GONE
            Toast.makeText(this, "Carga completa", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, destino))
        }, 2000)
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "En el evento onStart()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "En el evento onRestart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "En el evento onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "En el evento onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "En el evento onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "En el evento onDestroy()")
    }
}