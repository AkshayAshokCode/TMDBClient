package com.akshayashokcode.tmdbclient.domain.usecase

import com.akshayashokcode.tmdbclient.data.model.movie.Movie
import com.akshayashokcode.tmdbclient.domain.repository.MovieRepository

class GetMoviesUseCase(private val movieRepository: MovieRepository) {
    suspend fun execute(): List<Movie>? = movieRepository.getMovies()

}