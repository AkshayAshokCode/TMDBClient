package com.akshayashokcode.tmdbclient.data.repository.movie.datasource

import com.akshayashokcode.tmdbclient.data.model.movie.MoviesList
import retrofit2.Response

interface MovieRemoteDataSource {
    suspend fun getMovies(): Response<MoviesList>
}