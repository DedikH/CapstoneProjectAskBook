package com.example.capstoneprojectaskbook.View

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.capstoneprojectaskbook.R

class LupaPassword : AppCompatActivity() {

    private var mbtn_lupapassword: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lupa_password)

        mbtn_lupapassword = findViewById(R.id.btnreset)

        mbtn_lupapassword!!.setOnClickListener {
            val lupaPassword = Intent(
                applicationContext,
                Login::class.java
            )
            startActivity(lupaPassword)
        }
    }
}