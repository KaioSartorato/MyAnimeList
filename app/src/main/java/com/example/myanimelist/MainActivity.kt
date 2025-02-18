package com.example.myanimelist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val limpar: Button = findViewById(R.id.criarConta)

        limpar.setOnClickListener(){
            Toast.makeText(this, "Problema ao criar Conta!", Toast.LENGTH_LONG).show()
        }
    }

    fun Home(view: View) {
        var intent = Intent(this, Home::class.java)
        startActivity(intent)
    }
}