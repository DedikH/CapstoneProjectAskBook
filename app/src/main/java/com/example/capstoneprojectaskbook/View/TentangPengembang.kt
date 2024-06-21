package com.example.capstoneprojectaskbook.View

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.capstoneprojectaskbook.R

class TentangPengembang : AppCompatActivity() {

    private var mbtn_afri: ImageView? = null
    private var mbtn_megi: ImageView? = null
    private var mbtn_alex: ImageView? = null
    private var mbtn_aldi: ImageView? = null
    private var mbtn_nugraha: ImageView? = null
    private var mbtn_dedik: ImageView? = null
    private var mbtn_aji: ImageView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tentang_pengembang)

        mbtn_afri = findViewById(R.id.ivafri)

        mbtn_afri!!.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Info Aplikasi")
            builder.setMessage(
                " Nama : \n Afriana Wardiman \n\n" +
                        " ID:\n C012D4KY0332 \n\n" +
                        " Universitas: \n Universitas Telkom \n\n" +
                        " Cohort: \n Cloud Computing\n"
            )

            builder.setPositiveButton("OK") { dialog, which ->
                dialog.dismiss()
            }
            val dialog = builder.create()
            dialog.show()
        }
    }
}