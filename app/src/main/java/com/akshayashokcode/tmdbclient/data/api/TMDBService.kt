package com.akshayashokcode.tmdbclient.data.api

import com.akshayashokcode.tmdbclient.data.model.ArtistList
import com.akshayashokcode.tmdbclient.data.model.MoviesList
import com.akshayashokcode.tmdbclient.data.model.TvShowList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface TMDBService {

    @GET("movie/popular")
    suspend fun getPopularMovies(@Query("api_key") apiKey: String): Response<MoviesList>

    @GET("tv/popular")
    suspend fun getPopularTvShows(@Query("api_key") apiKey: String): Response<TvShowList>

    @GET("person/popular")
    suspend fun getPopularArtists(@Query("api_key") apiKey: String): Response<ArtistList>
}