package com.akshayashokcode.tmdbclient.presentation.movie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.akshayashokcode.tmdbclient.R
import com.akshayashokcode.tmdbclient.databinding.ActivityMovieBinding

class MovieActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMovieBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_movie)
    }
}