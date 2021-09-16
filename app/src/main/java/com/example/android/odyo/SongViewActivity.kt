package com.example.android.odyo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isVisible

class SongViewActivity : AppCompatActivity() {

    private lateinit var flPlayPause: FrameLayout
    private lateinit var tvCurrentlyPlaying: TextView
    private lateinit var ivPause: ImageView
    private lateinit var ivPlay: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_song_view)

        flPlayPause = findViewById(R.id.flPlayPause)
        tvCurrentlyPlaying = findViewById(R.id.tvCurrentSong)
        ivPause = findViewById(R.id.ivPause)
        ivPlay = findViewById(R.id.ivPlay)

        flPlayPause.setOnClickListener {
            if(ivPlay.isVisible){
                ivPlay.isVisible = false
                ivPause.isVisible = true
            }else{
                ivPause.isVisible = false
                ivPlay.isVisible = true
            }
        }

        tvCurrentlyPlaying.text = intent.getStringExtra("title")
    }
}