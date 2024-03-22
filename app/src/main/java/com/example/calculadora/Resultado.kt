package com.example.calculadora

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class Resultado : AppCompatActivity() {
    var m = Ma()
    private lateinit var mensaje: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.resultado)
        val intent2 = intent
        mensaje = findViewById(R.id.resultadotxt)
        if (intent2.getDoubleExtra("resultado", -0.0) != -0.0) {
            mensaje.text = intent2.getDoubleExtra("resultado", -0.0).toString()
        } else if (intent2.getLongExtra("resultado", -1) != -1L) {
            mensaje.text = intent2.getLongExtra("resultado", -1).toString()
        }
    }
}
