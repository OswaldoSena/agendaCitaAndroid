package com.sena.agendacita

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class InicioActivity : AppCompatActivity() {
    // metodo principal, pantalla
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //para esta pantalla es este diseño
        setContentView(R.layout.activity_inicio)
        //boton inicio
        val btnIndex= findViewById<Button>(R.id.btnIndex)
        btnIndex.setOnClickListener{navigateToIndex()}
    }
    private fun navigateToIndex(){
        val intent = Intent(this, IndexActivity::class.java)
        startActivity(intent)
    }
}