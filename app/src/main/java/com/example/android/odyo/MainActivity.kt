package com.example.android.odyo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var btnFileExplorer: Button
    private lateinit var btnAllSongs: Button
    private lateinit var btnPlaylists: Button
    private lateinit var btnFavourites: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnFileExplorer = findViewById(R.id.btnFileExplorer)
        btnAllSongs = findViewById(R.id.btnAllSongs)
        btnPlaylists = findViewById(R.id.btnPlaylists)
        btnFavourites = findViewById(R.id.btnFavourites)


        btnFileExplorer.setOnClickListener{
            intent = Intent(this, FileExplorerActivity::class.java)
            startActivity(intent)
        }
        btnFavourites.setOnClickListener {
            Toast.makeText(this, "Playlist \"Favourites\" is empty", Toast.LENGTH_SHORT).show()
        }
        btnPlaylists.setOnClickListener {
            Toast.makeText(this, "No Playlists at the moment", Toast.LENGTH_SHORT).show()
        }
        btnAllSongs.setOnClickListener {
            intent = Intent(this, AllSongsActivity::class.java)
            intent.putExtra("title", "ALL SONGS")
            startActivity(intent)
        }
    }
}