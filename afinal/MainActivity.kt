package com.example.afinal

import android.content.Intent
import android.content.pm.ActivityInfo
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
        // Hide the status bar.
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        // Remember that you should never show the action bar if the
        // status bar is hidden, so hide that too if necessary.
        actionBar?.hide()

        //Inisialisasi xml
        val btn_Play = findViewById<Button>(R.id.btn_play)
        val btn_Collection = findViewById<Button>(R.id.btn_collection)
        val btn_Score = findViewById<Button>(R.id.btn_score)
        val btn_Exit = findViewById<Button>(R.id.btn_exit)
        val home = findViewById<LinearLayout>(R.id.home)
//        val svc = Intent(this, BackgroundSoundService::class.java)
//        startService(svc)

        var mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.dark_forest)
        mediaPlayer?.start() // no need to call prepare(); create() does that for you
//        mediaPlayer?.setVolume(100f, 100f)



        btn_Play.setOnClickListener {
            val eIntent = Intent (this@MainActivity,GameView::class.java)
            eIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(eIntent)


        }

        btn_Score.setOnClickListener {

            val eIntent = Intent (this@MainActivity,HighScore::class.java)
            startActivity(eIntent)

        }
        btn_Collection.setOnClickListener {
            val eIntent = Intent (this@MainActivity,GameCollection::class.java)
            startActivity(eIntent)
        }

        btn_Exit.setOnClickListener {
            mediaPlayer?.release()
            mediaPlayer=null
            System.exit(-1)

        }


    }
}