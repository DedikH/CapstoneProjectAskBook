package com.example.capstoneprojectaskbook.View

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.capstoneprojectaskbook.R
import com.example.capstoneprojectaskbook.databinding.ActivityHalamanDetailKategoriBukuNonFiksiBinding

class HalamanDetailKategoriBukuNonFiksi : AppCompatActivity() {
    private lateinit var binding : ActivityHalamanDetailKategoriBukuNonFiksiBinding
    private val bookTitles = listOf(
        "Sebuah Seni Untuk Bersikap Bodo Amat",
        "I Want To Die But I Want To Eat Tteokbokki",
        "Rudy: Kisah Masa Muda Sang Visioner",
        "Ketika Mozart Kecil Memainkan Jemarinya",
        "Atomic Habits"
    )
    private val bookDescriptions = listOf(
        "Dalam buku ini juga memakai suatu pendekatan yang unik, sehingga dapat mengubah cara pandang kamu saat ini terhadap suatu problem yang ditemui sehari-hari.",
        "Di era media sosial seperti sekarang, di mana kadang seseorang merasa kurang percaya pada dirinya sendiri hingga merasa iri pada orang lain secara berlebihan.",
        "Dalam buku ini, kamu akan mengetahui kisah perjalanan Rudy (sebutan akrab Habibie) semasa muda hingga dewasa dalam menjemput mimpinya sebagai seorang insinyur Indonesia yang membuat pesawat untuk negaranya.",
        "Dalam buku ini, penulisnya membuka dengan terbuka rahasia para jenius yang mungkin kamu ketahui atau pernah dengar namanya barang sekali.",
        "Dalam buku yang ditulis oleh James Clear tersebut kamu akan mengetahui apa saja cara yang bisa kamu lakukan untuk merubah diri sendiri yang bisa dimulai dari hal-hal yang kecil, yang nantinya akan berdampak pada perubahan yang jauh lebih besar.",
        "Novel komedi romantis tentang seorang pria yang berusaha mendapatkan kembali cintanya",
        "Novel romantis yang menceritakan kisah cinta segitiga antara dua sahabat dan seorang gadis",
        "Novel persahabatan tentang lima sahabat yang melakukan perjalanan wisata ke Gunung Semeru",
        "Buku non-fiksi yang membahas tentang teori dan teknik pembuatan film"
    )
    private val bookRatings = listOf(8.5f, 9.0f, 7.8f, 8.2f, 7.5f, 8.0f, 8.8f, 9.2f, 8.1f)
    private val bookLinks = listOf(
        "https://shopee.co.id/product/515583666/12614856459?gsht=DKw0uyfn1N5Bug6z",
        "www.example.com/I Want To Die But I Want To Eat Tteokbokki",
        "www.example.com/Rudy: Kisah Masa Muda Sang Visioner",
        "www.example.com/Ketika Mozart Kecil Memainkan Jemarinya",
        "www.example.com/Atomic Habits",
        "www.example.com/koala-kumal",
        "www.example.com/tentang-kamu",
        "www.example.com/5-cm",
        "www.example.com/memahami-film"
    )

    private var selectedBookIndex = -1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHalamanDetailKategoriBukuNonFiksiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = intent
        if (intent != null) {
            val selectedBookTitle = intent.getStringExtra("BOOK_NAME")
            if (selectedBookTitle != null) {
                selectedBookIndex = bookTitles.indexOf(selectedBookTitle)
            }
        }

        if (selectedBookIndex >= 0) {
            val selectedBook = bookTitles[selectedBookIndex]
            val description = bookDescriptions[selectedBookIndex]
            val rating = bookRatings[selectedBookIndex]
            val link = bookLinks[selectedBookIndex]

            val txttitleBook =binding.titleBooknonfiksi
            val txtdeskripsi = binding.deskripsiSingkatnonfiksi
            val txtrating = binding.ratingnonfiksi
            val txtlink = binding.linknonfiksi
            val imageView = binding.imageViewnonfiksi

            txttitleBook.text = selectedBook
            txtdeskripsi.text = description
            txtrating.text = String.format("%.1f/10", rating)
            txtlink.text = link

            if (selectedBook == "Sebuah Seni Untuk Bersikap Bodo Amat"){
                imageView.setImageResource(R.drawable.sebuahseni)
            }
            if (selectedBook == "I Want To Die But I Want To Eat Tteokbokki"){
                imageView.setImageResource(R.drawable.tteokbokki)
            }
            if (selectedBook == "Rudy: Kisah Masa Muda Sang Visioner"){
                imageView.setImageResource(R.drawable.rudyvisioner)
            }
            if (selectedBook == "Ketika Mozart Kecil Memainkan Jemarinya"){
                imageView.setImageResource(R.drawable.mozart)
            }
            if (selectedBook == "Atomic Habits"){
                imageView.setImageResource(R.drawable.atomichabits)
            }
        }
    }
}