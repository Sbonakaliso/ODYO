package com.example.android.odyo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast

class FileExplorerActivity : AppCompatActivity() {

    private lateinit var llAnimations: LinearLayout
    private lateinit var llAppData: LinearLayout
    private lateinit var llDocuments: LinearLayout
    private lateinit var llImages: LinearLayout
    private lateinit var llMovies: LinearLayout
    private lateinit var llMusic: LinearLayout
    private lateinit var llNotes: LinearLayout
    private lateinit var llVideos: LinearLayout
    private lateinit var llWorkFiles: LinearLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_file_explorer)

        llAnimations = findViewById(R.id.llAnimations);
        llAppData = findViewById(R.id.llAppData);
        llDocuments = findViewById(R.id.llDocuments);
        llImages = findViewById(R.id.llImages);
        llMovies = findViewById(R.id.llMovies);
        llMusic = findViewById(R.id.llMusic);
        llNotes = findViewById(R.id.llNotes);
        llVideos = findViewById(R.id.llVideos);
        llWorkFiles = findViewById(R.id.llWorkFiles);

        llAnimations.setOnClickListener {
            Toast.makeText(this, "Can't open Animations", Toast.LENGTH_SHORT).show()
        }
        llAppData.setOnClickListener {
            Toast.makeText(this, "Can't open AppData", Toast.LENGTH_SHORT).show()
        }
        llDocuments.setOnClickListener {
            Toast.makeText(this, "Can't open Documents", Toast.LENGTH_SHORT).show()
        }
        llImages.setOnClickListener {
            Toast.makeText(this, "Can't open Images", Toast.LENGTH_SHORT).show()
        }
        llMovies.setOnClickListener {
            Toast.makeText(this, "Can't open Movies", Toast.LENGTH_SHORT).show()
        }
        llMusic.setOnClickListener {
            intent = Intent(this, AllSongsActivity::class.java)
            intent.putExtra("title", "MUSIC")
            startActivity(intent)
        }
        llNotes.setOnClickListener {
            Toast.makeText(this, "Can't open Notes", Toast.LENGTH_SHORT).show()
        }
        llVideos.setOnClickListener {
            Toast.makeText(this, "Can't open Videos", Toast.LENGTH_SHORT).show()
        }
        llWorkFiles.setOnClickListener {
            Toast.makeText(this, "Can't open WorkFiles", Toast.LENGTH_SHORT).show()
        }
    }
}