package com.sena.agendacita

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class IndexActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_index)

        //boton cancelar
        val btncancel= findViewById<Button>(R.id.btncancel)
        btncancel.setOnClickListener{navigateToInicio()}
    }
    private fun navigateToInicio(){
        val intent = Intent(this, InicioActivity::class.java)
        startActivity(intent)

    }
}