package com.example.ct1proyect.Vistas

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.ct1proyect.R

class IngresoPantallaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ingreso_pantalla)

        val btnSalir = findViewById<Button>(R.id.btnSalir);

        btnSalir.setOnClickListener {

            val titleMsg : String = "¿Seguro?"
            val bodyMsg : String = "¿Esta seguro que desea abandonar la aplicación? "

            showModalConfirmExit(titleMsg, bodyMsg);

        }

    }

    private fun showModalConfirmExit(titleMsg : String, bodyMsg : String) {

        val dialogConfirm = Dialog (this)
        dialogConfirm.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialogConfirm.setCancelable(false)
        dialogConfirm.setContentView(R.layout.confirmacionactivity)

        dialogConfirm.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        val titleModal: TextView = dialogConfirm.findViewById(R.id.TitleConfir)
        val bodyMsgModel : TextView = dialogConfirm.findViewById(R.id.messageconfir)

        val btnSi : Button = dialogConfirm.findViewById(R.id.btnSi)
        val btnNo : Button = dialogConfirm.findViewById(R.id.btnNo)

        titleModal.text = titleMsg
        bodyMsgModel.text = bodyMsg

        btnSi.setOnClickListener {

            val PantallaPrincipalActivity = Intent(this, PantallaPrincipalActivity::class.java)
            startActivity(PantallaPrincipalActivity)

        }

            btnNo.setOnClickListener {

                dialogConfirm.dismiss()

            }

        dialogConfirm.show()


    }



}