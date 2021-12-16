package com.akshayashokcode.tmdbclient.domain.usecase

import com.akshayashokcode.tmdbclient.data.model.tvshow.TvShow
import com.akshayashokcode.tmdbclient.domain.repository.TvShowRepository

class UpdateTvShowsUseCase(private val tvShowRepository: TvShowRepository) {
    suspend fun execute(): List<TvShow>? = tvShowRepository.updateTvShows()

}