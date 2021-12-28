package com.akshayashokcode.tmdbclient.data.repository.tvshow.datasource

import com.akshayashokcode.tmdbclient.data.model.tvshow.TvShowList
import retrofit2.Response

interface TvShowRemoteDataSource {
    suspend fun getTvShows():Response<TvShowList>
}