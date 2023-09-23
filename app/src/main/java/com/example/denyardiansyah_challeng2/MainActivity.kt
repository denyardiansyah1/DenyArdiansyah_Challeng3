package com.example.denyardiansyah_challeng2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onPause() {
        super.onPause()
        println("onPause")
    }

    override fun onRestart() {
        super.onRestart()
        println("onRestart")
    }

}