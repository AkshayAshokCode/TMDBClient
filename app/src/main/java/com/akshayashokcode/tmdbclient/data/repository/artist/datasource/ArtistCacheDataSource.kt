package com.akshayashokcode.tmdbclient.data.repository.artist.datasource

import com.akshayashokcode.tmdbclient.data.model.artist.Artist

interface ArtistCacheDataSource {
    suspend fun getArtistsFromCache():List<Artist>
    suspend fun saveArtistsToCache(Artists:List<Artist>)
}