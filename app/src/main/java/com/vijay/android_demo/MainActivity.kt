package com.vijay.android_demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var nextBtn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nextBtn=findViewById(R.id.button)
        nextBtn.setOnClickListener {
            Intent(this@MainActivity,SecondActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}