package com.akshayashokcode.tmdbclient.data.repository.movie.datasource

import com.akshayashokcode.tmdbclient.data.model.movie.Movie
import com.akshayashokcode.tmdbclient.data.model.movie.MoviesList

interface MovieCacheDataSource {
    suspend fun getMoviesFromCache(): List<Movie>
    suspend fun saveMoviesToCache(movies: List<Movie>)
}