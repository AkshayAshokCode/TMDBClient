package com.akshayashokcode.tmdbclient.domain.repository

import com.akshayashokcode.tmdbclient.data.model.movie.Movie

interface MovieRepository {

    suspend fun getMovies():List<Movie>?

    suspend fun updateMovies():List<Movie>?
}