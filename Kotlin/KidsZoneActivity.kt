package com.example.events

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class KidsZoneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_music)

        supportActionBar?.title = "Comedy Section"
    }
}
