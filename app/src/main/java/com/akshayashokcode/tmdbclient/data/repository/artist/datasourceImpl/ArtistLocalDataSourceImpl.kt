package com.akshayashokcode.tmdbclient.data.repository.artist.datasourceImpl

import com.akshayashokcode.tmdbclient.data.db.ArtistDao
import com.akshayashokcode.tmdbclient.data.model.artist.Artist
import com.akshayashokcode.tmdbclient.data.repository.artist.datasource.ArtistLocalDataSource
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ArtistLocalDataSourceImpl(private val artistDao: ArtistDao):ArtistLocalDataSource {
    override suspend fun getArtistsFromDB(): List<Artist> {
        return artistDao.getArtists()
    }

    override suspend fun saveArtistsToDB(Artists: List<Artist>) {
        CoroutineScope(Dispatchers.IO).launch {
            artistDao.saveArtists(Artists)
        }
    }

    override suspend fun clearAll() {
       CoroutineScope(Dispatchers.IO).launch {
           artistDao.deleteArtists()
       }
    }
}