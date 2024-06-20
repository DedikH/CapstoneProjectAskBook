package com.example.capstoneprojectaskbook.View.ListBook

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.capstoneprojectaskbook.R
import com.example.capstoneprojectaskbook.databinding.ActivityDetailKategoriBukuBinding
import com.example.capstoneprojectaskbook.databinding.ActivityHalamanDetailKategoriBukuBinding
import android.R.layout.simple_list_item_1
import android.content.Intent
import android.widget.AdapterView
import com.example.capstoneprojectaskbook.View.HalamanDetailKategoriBuku

class DetailKategoriBuku : AppCompatActivity() {
    private lateinit var binding : ActivityDetailKategoriBukuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailKategoriBukuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fiksibook = listOf("Laskar Pelangi", "Dilan 1990", "Promise", "Bumi Manusia", "Rumah kaca", "Koala Kumal", "Tentang Kamu", "5 cm", "Memahami Film", "Sangkuriang", "Student Hidjo", "Funiculi Funicula", "Pangeran Cilik: Le Petit Prince", "Man Boy", "Keajaiban Toko Kelontong Namiya", "Laut Bercerita", "Aroma Karsa", "Selamat Tinggal")

        val listadapter = ArrayAdapter(this, simple_list_item_1, fiksibook)
        binding.listItem.adapter = listadapter

        binding.listItem.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            val selectedBook = fiksibook[position]
            val intent = Intent(this, HalamanDetailKategoriBuku::class.java)
            intent.putExtra("BOOK_NAME", selectedBook)
            startActivity(intent)
        }
    }
}