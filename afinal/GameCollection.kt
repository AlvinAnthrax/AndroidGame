package com.example.afinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class GameCollection : AppCompatActivity() {
    private lateinit  var _rvCollection : RecyclerView
    private fun TampilkanData(){
        _rvCollection.layoutManager = LinearLayoutManager(this)

        val adapterP = adapterColletion("question")
        _rvCollection.adapter = adapterP
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_collection)


        _rvCollection = findViewById(R.id.rvCollection)
        TampilkanData()
    }
}