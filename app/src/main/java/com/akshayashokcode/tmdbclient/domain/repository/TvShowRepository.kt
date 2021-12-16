package com.akshayashokcode.tmdbclient.domain.repository

import com.akshayashokcode.tmdbclient.data.model.tvshow.TvShow

interface TvShowRepository {
    suspend fun getTvShows():List<TvShow>?
    suspend fun updateTvShows():List<TvShow>?
}