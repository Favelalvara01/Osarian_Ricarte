package com.example.osarian

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent

class SelectGame : AppCompatActivity() {
    //el lateinit sirve para iniciar las variables y despues
    //usarla en el override fun para mandar a llamar las ids
    lateinit var btnGato: Button
    lateinit var btnHockey: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_game)
        btnGato= findViewById(R.id.btn_select)
        btnHockey= findViewById(R.id.btn_select_hockey)

        btnGato.setOnClickListener {
            val intent = Intent(applicationContext, UserActivity::class.java)
            startActivity(intent)
        }

        btnHockey.setOnClickListener {
            val intent = Intent(applicationContext, UserActivity::class.java)
            startActivity(intent)
        }
    }
}