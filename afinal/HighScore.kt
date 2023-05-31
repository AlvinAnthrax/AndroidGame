package com.example.afinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class HighScore : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_high_score)


        var score = mutableListOf<Int>()
        var name = mutableListOf<String>()
        val lvScoreAdapter : ArrayAdapter<Int> = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            score
        )
        val lvNameAdapter : ArrayAdapter<String> = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            name
        )
        val _lvScore = findViewById<ListView>(R.id.lvScore)
        val _lvName = findViewById<ListView>(R.id.lvName)
    }
}