package com.example.a3prog_actividades

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SegundaActividad : AppCompatActivity() {

    private val TAG = "SegundaActividad"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_segunda_actividad)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        Log.d(TAG, "En el evento onCreate()")
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