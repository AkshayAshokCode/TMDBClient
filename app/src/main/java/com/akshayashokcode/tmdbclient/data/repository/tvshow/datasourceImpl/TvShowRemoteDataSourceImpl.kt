package com.akshayashokcode.tmdbclient.data.repository.tvshow.datasourceImpl

import com.akshayashokcode.tmdbclient.data.api.TMDBService
import com.akshayashokcode.tmdbclient.data.model.tvshow.TvShowList
import com.akshayashokcode.tmdbclient.data.repository.tvshow.datasource.TvShowRemoteDataSource
import retrofit2.Response

class TvShowRemoteDataSourceImpl(private val tmdbService: TMDBService,private val apiKey:String):TvShowRemoteDataSource {
    override suspend fun getTvShows(): Response<TvShowList> =tmdbService.getPopularTvShows(apiKey)
}