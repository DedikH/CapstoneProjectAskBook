package com.example.capstoneprojectaskbook.View

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.capstoneprojectaskbook.R

class Login : AppCompatActivity() {

    private var doubleBackToExitPressedOnce = false

    @SuppressLint("MissingSuperCall")
    override fun onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            showExitConfirmationDialog()
            return
        }

        this.doubleBackToExitPressedOnce = true
        Toast.makeText(this, "Tekan sekali lagi untuk keluar", Toast.LENGTH_SHORT).show()

        Handler().postDelayed({
            doubleBackToExitPressedOnce = false
        }, 2000) // Waktu dalam milidetik sebelum reset status "double back"
    }

    private fun showExitConfirmationDialog() {
        val builder = AlertDialog.Builder(this)
        builder.setMessage("Apakah Anda yakin ingin keluar?")
        builder.setPositiveButton("Ya") { _, _ ->
            finishAffinity() // Menutup aplikasi saat "Ya" diklik
        }
        builder.setNegativeButton("Tidak") { dialog, _ ->
            dialog.dismiss() // Menutup dialog saat "Tidak" diklik
        }
        val dialog = builder.create()
        dialog.show()
    }

    private var mbtn_login: Button? = null
    private var mbtn_register: Button? = null
    private var mbtn_lupapassword: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        mbtn_login = findViewById<View>(R.id.btnlogin) as Button
        mbtn_register = findViewById<View>(R.id.btnregister) as Button
        mbtn_lupapassword = findViewById<View>(R.id.btnlupapassword) as Button

        mbtn_login!!.setOnClickListener {
            val dashboard = Intent(
                applicationContext,
                Dashboard::class.java
            )
            startActivity(dashboard)
        }

        mbtn_register!!.setOnClickListener {
            val register = Intent(
                applicationContext,
                Register::class.java
            )
            startActivity(register)
        }

        mbtn_lupapassword!!.setOnClickListener {
            val lupapassword = Intent(
                applicationContext,
                LupaPassword::class.java
            )
            startActivity(lupapassword)
        }

    }
}