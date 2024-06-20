package com.example.capstoneprojectaskbook.View

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.capstoneprojectaskbook.R
import com.example.capstoneprojectaskbook.View.ListBook.DetailKategoriBuku

class PilihKategoriBuku : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pilih_kategori_buku)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val fiksi = findViewById(R.id.ivfiksi) as ImageView
        val nonfiksi = findViewById(R.id.ivnonfiksi) as ImageView

        fiksi.setOnClickListener{
            val intent = Intent(this, DetailKategoriBuku::class.java)
            startActivity(intent)
        }
    }
}