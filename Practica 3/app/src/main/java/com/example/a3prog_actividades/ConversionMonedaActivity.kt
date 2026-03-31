package com.example.a3prog_actividades


import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ConversionMonedaActivity : AppCompatActivity() {

    private lateinit var etMonto: EditText
    private lateinit var rbSolesDolares: RadioButton
    private lateinit var rbDolaresSoles: RadioButton
    private lateinit var btnConvertir: Button
    private lateinit var txtResultado: TextView

    private val tipoCambio = 3.80

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conversion_moneda)

        etMonto = findViewById(R.id.etMonto)
        rbSolesDolares = findViewById(R.id.rbSolesDolares)
        rbDolaresSoles = findViewById(R.id.rbDolaresSoles)
        btnConvertir = findViewById(R.id.btnConvertir)
        txtResultado = findViewById(R.id.txtResultado)

        btnConvertir.setOnClickListener {
            convertirMoneda()
        }
    }

    private fun convertirMoneda() {
        val montoTexto = etMonto.text.toString()

        if (montoTexto.isEmpty()) {
            Toast.makeText(this, "Ingrese un monto", Toast.LENGTH_SHORT).show()
            return
        }

        val monto = montoTexto.toDouble()
        val resultado: Double
        val mensaje: String

        if (rbSolesDolares.isChecked) {
            resultado = monto / tipoCambio
            mensaje = "Resultado: %.2f dólares".format(resultado)
        } else {
            resultado = monto * tipoCambio
            mensaje = "Resultado: %.2f soles".format(resultado)
        }

        txtResultado.text = mensaje
    }
}