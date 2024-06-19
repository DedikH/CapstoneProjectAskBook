package com.example.capstoneprojectaskbook.View

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import com.example.capstoneprojectaskbook.R

class Register : AppCompatActivity() {

    private var mbtn_register: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        mbtn_register = findViewById<View>(R.id.btnregister) as Button

        mbtn_register!!.setOnClickListener {
            val register = Intent(
                applicationContext,
                Login::class.java
            )
            startActivity(register)
        }
    }
}