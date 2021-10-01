package com.application.espressotest

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Having issue with detecting button_next_activity in layout, using findViewById instead - need to fix issue
        val buttonNextActivity = findViewById<Button>(R.id.button_next_activity)

        buttonNextActivity.setOnClickListener {
            val intent = Intent(this, SecondaryActivity::class.java)
            startActivity(intent)
        }
    }
}