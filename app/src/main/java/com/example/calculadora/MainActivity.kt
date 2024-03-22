package com.example.calculadora

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private var m = Ma()
    private lateinit var sum: Button
    private lateinit var res: Button
    private lateinit var mult: Button
    private lateinit var div: Button
    private lateinit var pot: Button
    private lateinit var suc: Button
    private lateinit var fact: Button
    private lateinit var num1: EditText
    private lateinit var num2: EditText
    private lateinit var name: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val i = intent


        name = findViewById<TextView>(R.id.name)
        num1 = findViewById<EditText>(R.id.dato1)
        num2 = findViewById<EditText>(R.id.dato2)
        sum = findViewById<Button>(R.id.button)
        res = findViewById<Button>(R.id.button2)
        mult = findViewById<Button>(R.id.button3)
        div = findViewById<Button>(R.id.button4)
        pot = findViewById<Button>(R.id.button5)
        suc = findViewById<Button>(R.id.button6)
        fact = findViewById<Button>(R.id.button7)
        name.text = "Hola " + i.getStringExtra("name")
        sum.setOnClickListener(View.OnClickListener { view: View? ->
        val resultado = m.funcionSuma(
        num1.text.toString().toDouble(),
        num2.text.toString().toInt().toDouble()
        )
        nextView(resultado)
        })
        res.setOnClickListener(View.OnClickListener { view: View? ->
        val resultado = m.funcionResta(
        num1.text.toString().toDouble(),
        num2.text.toString().toDouble()
        )
        nextView(resultado)
        })
        mult.setOnClickListener(View.OnClickListener { view: View? ->
        val resultado = m.funcionMultiplicacion(
        num1.text.toString().toDouble(),
        num2.text.toString().toDouble()
        )
        nextView(resultado)
        })
        div.setOnClickListener(View.OnClickListener { view: View? ->
        val resultado = m.funcionDivision(
        num1.text.toString().toDouble(),
        num2.text.toString().toDouble()
        )
        nextView(resultado)
        })
        pot.setOnClickListener(View.OnClickListener { view: View? ->
        val resultado = m.funcionPotencia(
        num1.text.toString().toDouble(),
        num2.text.toString().toDouble()
        )
        nextView(resultado)
        })
        fact.setOnClickListener(View.OnClickListener { view: View? ->
        val resultado = m.funcionFactorial(num1.text.toString().toDouble())
        nextView(resultado)
        })
        suc.setOnClickListener(View.OnClickListener { view: View? ->
        val resultado = m.funcionSucesion(
        num1.text.toString().toLong()
        .toDouble()
        )
        nextView(resultado)
        })
        }

private fun nextView(res: Double) {
        val intent = Intent(this@MainActivity, Resultado::class.java)
        intent.putExtra("resultado", res)
        startActivity(intent)
        }

private fun nextView(res: Long) {
        val intent = Intent(this@MainActivity, Resultado::class.java)
        intent.putExtra("resultado", res)
        startActivity(intent)
        }
        }