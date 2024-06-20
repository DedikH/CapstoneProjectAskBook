package com.example.capstoneprojectaskbook.View

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.capstoneprojectaskbook.R

class Dashboard : AppCompatActivity() {

    private var mbtn_pilihgenre: Button? = null
    private var mbtn_profil: ImageView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        mbtn_pilihgenre = findViewById(R.id.btnpilihgenre)
        mbtn_profil = findViewById(R.id.ivprofil)

        mbtn_pilihgenre!!.setOnClickListener {
            val pilihgenre = Intent(
                applicationContext,
                PilihKategoriBuku::class.java
            )
            startActivity(pilihgenre)
        }

        mbtn_profil!!.setOnClickListener {
            val profil = Intent(
                applicationContext,
                Profil::class.java
            )
            startActivity(profil)
        }
    }
}