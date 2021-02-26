package com.ctt.carregister

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botaoCadastrar = findViewById<Button>(R.id.btnCadastrar)
        val modelo = findViewById<EditText>(R.id.edtModel)
        val placa = findViewById<EditText>(R.id.edtPlate)
        val cor = findViewById<EditText>(R.id.edtColor)
        val ano = findViewById<EditText>(R.id.edtYear)
        val marca = findViewById<EditText>(R.id.edtBrand)
        val potencia = findViewById<EditText>(R.id.edtPotency)
        var contador = 0

        botaoCadastrar.setOnClickListener{
            val modeloDigitado = modelo.text.toString()
            val placaDigitado = placa.text.toString()
            val corDigitado = cor.text.toString()
            val anoDigitado = ano.text.toString()
            val marcaDigitado = marca.text.toString()
            val potenciaDigitado = potencia.text.toString()

            if (modeloDigitado.isEmpty() || placaDigitado.isEmpty() || corDigitado.isEmpty() || anoDigitado.isEmpty() || marcaDigitado.isEmpty() || potenciaDigitado.isEmpty()){
                Toast.makeText(this,"Algum campo está em branco!", Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this,"Cadastro realizado com sucesso!", Toast.LENGTH_LONG).show()
            }
        }
    }
}