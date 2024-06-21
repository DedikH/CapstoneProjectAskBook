package com.example.capstoneprojectaskbook.View.ListBook

import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.capstoneprojectaskbook.R
import com.example.capstoneprojectaskbook.View.HalamanDetailKategoriBuku
import com.example.capstoneprojectaskbook.View.HalamanDetailKategoriBukuNonFiksi
import com.example.capstoneprojectaskbook.databinding.ActivityDetailKategoriBukuBinding
import com.example.capstoneprojectaskbook.databinding.ActivityDetailKategoriBukuNonFiksiBinding

class DetailKategoriBukuNonFiksi : AppCompatActivity() {
    private lateinit var binding : ActivityDetailKategoriBukuNonFiksiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailKategoriBukuNonFiksiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fiksibook = listOf("Sebuah Seni Untuk Bersikap Bodo Amat", "I Want To Die But I Want To Eat Tteokbokki", "Rudy: Kisah Masa Muda Sang Visioner", "Ketika Mozart Kecil Memainkan Jemarinya",
            "Atomic Habits")

        val listadapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, fiksibook)
        binding.listItem.adapter = listadapter

        binding.listItem.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            val selectedBook = fiksibook[position]
            val intent = Intent(this, HalamanDetailKategoriBukuNonFiksi::class.java)
            intent.putExtra("BOOK_NAME", selectedBook)
            startActivity(intent)
        }
    }
}