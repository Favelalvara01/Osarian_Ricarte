package com.example.osarian

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.EditText

class UserActivity : AppCompatActivity() {
    lateinit var txtUser1: EditText
    lateinit var txtUser2: EditText
    lateinit var btnjugar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        txtUser1=findViewById(R.id.txtuser1)
        txtUser2=findViewById(R.id.txtuser2)
        btnjugar=findViewById(R.id.btn_jugar)

        btnjugar.setOnClickListener {
            val intent= Intent(applicationContext, GatoActivity::class.java)
            intent.putExtra("player1", txtUser1.text.toString())
            intent.putExtra("player2", txtUser2.text.toString())
            startActivity(intent)
        }
    }
}