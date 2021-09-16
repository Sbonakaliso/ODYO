package com.example.android.odyo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class AllSongsActivity : AppCompatActivity() {

    private lateinit var tvAllSongs: TextView

    private lateinit var clSongA: ConstraintLayout
    private lateinit var clSongB: ConstraintLayout
    private lateinit var clSongC: ConstraintLayout
    private lateinit var clSongD: ConstraintLayout
    private lateinit var clSongE: ConstraintLayout
    private lateinit var clSongF: ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_all_songs)

        tvAllSongs = findViewById(R.id.tvAllSongs)
        clSongA = findViewById(R.id.clSongA)
        clSongB = findViewById(R.id.clSongB)
        clSongC = findViewById(R.id.clSongC)
        clSongD = findViewById(R.id.clSongD)
        clSongE = findViewById(R.id.clSongE)
        clSongF = findViewById(R.id.clSongF)

        title = intent.getStringExtra("title")
        tvAllSongs.text = title

        clSongA.setOnClickListener {
            intent = Intent(this, SongViewActivity::class.java)
            intent.putExtra("title", "Artist 1 - Song A")
            startActivity(intent)
        }
        clSongB.setOnClickListener {
            intent = Intent(this, SongViewActivity::class.java)
            intent.putExtra("title", "Artist 2 - Song B")
            startActivity(intent)
        }
        clSongC.setOnClickListener {
            intent = Intent(this, SongViewActivity::class.java)
            intent.putExtra("title", "Artist 3 - Song C")
            startActivity(intent)
        }
        clSongD.setOnClickListener {
            intent = Intent(this, SongViewActivity::class.java)
            intent.putExtra("title", "Artist 1 - Song D")
            startActivity(intent)
        }
        clSongE.setOnClickListener {
            intent = Intent(this, SongViewActivity::class.java)
            intent.putExtra("title", "Artist 4 - Song E")
            startActivity(intent)
        }
        clSongF.setOnClickListener {
            intent = Intent(this, SongViewActivity::class.java)
            intent.putExtra("title", "Artist 4 - Song F")
            startActivity(intent)
        }
    }
}