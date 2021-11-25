package com.example.a25112021

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.pies).setOnClickListener {
            findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.pies)
        }
        findViewById<Button>(R.id.kot).setOnClickListener {
            findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.kot)
        }
        findViewById<Button>(R.id.nic).setOnClickListener {
            findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.nic)
        }
        findViewById<Button>(R.id.meski).setOnClickListener {
            findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.meski)
        }
    }
}