package com.akshayashokcode.tmdbclient.data.repository.artist.datasource

import com.akshayashokcode.tmdbclient.data.model.artist.ArtistList
import retrofit2.Response

interface ArtistRemoteDataSource {
    suspend fun getArtists():Response<ArtistList>
}