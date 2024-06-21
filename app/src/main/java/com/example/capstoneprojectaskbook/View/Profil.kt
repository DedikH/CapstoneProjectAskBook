package com.example.capstoneprojectaskbook.View

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.capstoneprojectaskbook.R

class Profil : AppCompatActivity() {

    private var mbtn_versi: CardView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)

        mbtn_versi = findViewById(R.id.VersiAPK)

        mbtn_versi!!.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Info Aplikasi")
            builder.setMessage(
                " Nama Aplikasi: \n AskBook \n\n" +
                        " Versi Aplikasi:\n 1.0 \n\n" +
                        " Tim ID: \n C241-PS259 \n\n" +
                        " Advisor: \n B24-0397 Yehezkiel Gunawan Cloud Computing\n" +
                        " B24-0441 Edi Darmawansah Business/\n" +
                        " Commerce/Ideation\n\n"
            )

            builder.setPositiveButton("OK") { dialog, which ->
                dialog.dismiss()
            }
            val dialog = builder.create()
            dialog.show()
        }
    }
}