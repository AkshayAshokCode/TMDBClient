package com.akshayashokcode.tmdbclient.domain.repository

import com.akshayashokcode.tmdbclient.data.model.artist.Artist

interface ArtistRepository {
    suspend fun getArtists():List<Artist>?
    suspend fun updateArtists():List<Artist>?
}