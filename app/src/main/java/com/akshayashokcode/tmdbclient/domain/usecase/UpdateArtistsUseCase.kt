package com.akshayashokcode.tmdbclient.domain.usecase

import com.akshayashokcode.tmdbclient.data.model.artist.Artist
import com.akshayashokcode.tmdbclient.domain.repository.ArtistRepository

class UpdateArtistsUseCase(private val artistRepository: ArtistRepository) {
    suspend fun execute(): List<Artist>? = artistRepository.updateArtists()
}