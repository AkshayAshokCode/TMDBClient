package com.akshayashokcode.tmdbclient.data.repository.artist.datasource

import com.akshayashokcode.tmdbclient.data.model.artist.Artist

interface ArtistLocalDataSource {
    suspend fun getArtistsFromDB():List<Artist>
    suspend fun saveArtistsToDB(Artists:List<Artist>)
    suspend fun clearAll()
}