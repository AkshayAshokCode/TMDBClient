package com.akshayashokcode.tmdbclient.data.repository.movie.datasourceImpl

import com.akshayashokcode.tmdbclient.data.api.TMDBService
import com.akshayashokcode.tmdbclient.data.model.movie.MoviesList
import com.akshayashokcode.tmdbclient.data.repository.movie.datasource.MovieRemoteDataSource
import retrofit2.Response

class MovieRemoteDataSourceImpl(private val tmdbService: TMDBService,private val apikey:String):
    MovieRemoteDataSource {
    override suspend fun getMovies(): Response<MoviesList> = tmdbService.getPopularMovies(apikey)
}