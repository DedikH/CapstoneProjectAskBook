package com.example.capstoneprojectaskbook.View

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.capstoneprojectaskbook.R
import com.example.capstoneprojectaskbook.databinding.ActivityHalamanDetailKategoriBukuBinding

class HalamanDetailKategoriBuku : AppCompatActivity() {
    private lateinit var binding : ActivityHalamanDetailKategoriBukuBinding
    private val bookTitles = listOf(
        "Laskar Pelangi",
        "Dilan 1990",
        "Promise",
        "Bumi Manusia",
        "Rumah Kaca",
        "Koala Kumal",
        "Tentang Kamu",
        "5 cm",
        "Memahami Film"
    )
    private val bookDescriptions = listOf(
        "Kisah inspiratif tentang persahabatan sepuluh anak Belitung yang bersekolah di SD Muhammadiyah Belitung",
        "Novel romantis yang menceritakan kisah cinta remaja bernama Dilan dan Milea di era 1990-an",
        "Novel fiksi ilmiah tentang petualangan dua sahabat di masa depan yang penuh dengan teknologi dan misteri",
        "Novel sejarah yang menceritakan perjuangan Minke melawan kolonialisme Belanda di awal abad ke-20",
        "Novel politik yang mengangkat isu korupsi dan ketidakadilan di Indonesia",
        "Novel komedi romantis tentang seorang pria yang berusaha mendapatkan kembali cintanya",
        "Novel romantis yang menceritakan kisah cinta segitiga antara dua sahabat dan seorang gadis",
        "Novel persahabatan tentang lima sahabat yang melakukan perjalanan wisata ke Gunung Semeru",
        "Buku non-fiksi yang membahas tentang teori dan teknik pembuatan film"
    )
    private val bookRatings = listOf(8.5f, 9.0f, 7.8f, 8.2f, 7.5f, 8.0f, 8.8f, 9.2f, 8.1f)
    private val bookLinks = listOf(
        "https://www.gramedia.com/products/new-edition-laskar-pelangi?queryID=15cad3e1568c75b43eb579739bb077e0",
        "https://www.gramedia.com/products/conf-dilan-dia-adalah-dilanku-tahun-1990?queryID=6fa1b6d5ed3abd66e846384ad3039eab",
        "https://www.gramedia.com/products/promise?queryID=b3dcccda80f1e0fe6f9c07d829fe1b6d",
        "www.example.com/bumi-manusia",
        "www.example.com/rumah-kaca",
        "www.example.com/koala-kumal",
        "www.example.com/tentang-kamu",
        "www.example.com/5-cm",
        "www.example.com/memahami-film"
    )

    private var selectedBookIndex = -1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHalamanDetailKategoriBukuBinding.inflate(layoutInflater)
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

            val txttitleBook =binding.titleBook
            val txtdeskripsi = binding.deskripsiSingkat
            val txtrating = binding.rating
            val txtlink = binding.link
            val imageView = binding.imageView

            txttitleBook.text = selectedBook
            txtdeskripsi.text = description
            txtrating.text = String.format("%.1f/10", rating)
            txtlink.text = link

            if (selectedBook == "Laskar Pelangi"){
                imageView.setImageResource(R.drawable.laskarpelangi)
            }
            if (selectedBook == "Dilan 1990"){
                imageView.setImageResource(R.drawable.dilan)
            }
            if (selectedBook == "Bumi Manusia"){
                imageView.setImageResource(R.drawable.bumimanusia)
            }
            if (selectedBook == "Koala Kumal"){
                imageView.setImageResource(R.drawable.koalakumal)
            }
            if (selectedBook == "Tentang Kamu"){
                imageView.setImageResource(R.drawable.tentangkamu)
            }
            if (selectedBook == "5 cm"){
                imageView.setImageResource(R.drawable.cm)
            }
            if (selectedBook == "Memahami Film"){
                imageView.setImageResource(R.drawable.memahamifilm)
            }
            if (selectedBook == "Promise"){
                imageView.setImageResource(R.drawable.promise)
            }
            if (selectedBook == "Rumah Kaca"){
                imageView.setImageResource(R.drawable.rumahkaca)
            }
        }
    }
}
