package com.example.osarian

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class GatoActivity : AppCompatActivity() {
    lateinit var lbluser1: TextView
    lateinit var lbluser2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gato)

        lbluser1=findViewById(R.id.lbl_user1)
        lbluser2=findViewById(R.id.lbl_user2)

        lbluser1.text=intent?.extras?.getString("player1").toString()
        lbluser2.text=intent?.extras?.getString("player2").toString()

    }
}