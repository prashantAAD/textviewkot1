package com.example.textviewkot1

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tv=findViewById<TextView>(R.id.t1)
        tv.setOnClickListener {
            Toast.makeText(this@MainActivity,"hello kotlin",Toast.LENGTH_LONG).show()
        }
    }
}