package com.akshayashokcode.tmdbclient.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.akshayashokcode.tmdbclient.R
import com.akshayashokcode.tmdbclient.databinding.ActivityHomeBinding
import com.akshayashokcode.tmdbclient.presentation.artist.ArtistActivity
import com.akshayashokcode.tmdbclient.presentation.movie.MovieActivity
import com.akshayashokcode.tmdbclient.presentation.tvshow.TvShowActivity

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_home)
        binding.moviesButton.setOnClickListener {
            val intent=Intent(this,MovieActivity::class.java)
            startActivity(intent)
        }
        binding.tvShowsButton.setOnClickListener {
            val intent=Intent(this,TvShowActivity::class.java)
            startActivity(intent)
        }
        binding.artistsButton.setOnClickListener {
            val intent=Intent(this,ArtistActivity::class.java)
            startActivity(intent)
        }
    }
}