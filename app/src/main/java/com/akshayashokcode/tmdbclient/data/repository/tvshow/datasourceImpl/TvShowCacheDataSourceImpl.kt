package com.akshayashokcode.tmdbclient.data.repository.tvshow.datasourceImpl

import com.akshayashokcode.tmdbclient.data.model.tvshow.TvShow
import com.akshayashokcode.tmdbclient.data.repository.tvshow.datasource.TvShowCacheDataSource

class TvShowCacheDataSourceImpl():TvShowCacheDataSource {
    private var tvShowList=ArrayList<TvShow>()
    override suspend fun getTvShowsFromCache(): List<TvShow> {
        return tvShowList
    }

    override suspend fun saveTvShowsToCache(tvShows: List<TvShow>) {
       tvShowList.clear()
        tvShowList=ArrayList(tvShows)
    }
}