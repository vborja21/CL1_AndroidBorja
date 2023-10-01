package com.example.ct1proyect.Vistas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.ct1proyect.R

class PantallaPrincipalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_principal)

        //crear cancelar

        val btnCrear = findViewById<Button>(R.id.btnCrear);
        val btnSalir = findViewById<Button>(R.id.btnCancelar);

        btnCrear.setOnClickListener {

            val productScreen = Intent (this, IngresoPantallaActivity::class.java)
            startActivity(productScreen)

        };

        btnSalir.setOnClickListener {

            Toast.makeText(this, "El usuario esta intentando cancelar el registro :(", Toast.LENGTH_LONG).show();

        }

    }
}