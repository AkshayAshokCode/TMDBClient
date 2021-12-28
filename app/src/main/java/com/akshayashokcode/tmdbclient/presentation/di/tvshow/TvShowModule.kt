package com.akshayashokcode.tmdbclient.presentation.di.tvshow

import com.akshayashokcode.tmdbclient.domain.usecase.GetTvShowsUseCase
import com.akshayashokcode.tmdbclient.domain.usecase.UpdateTvShowsUseCase
import com.akshayashokcode.tmdbclient.presentation.tvshow.TvShowViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class TvShowModule {

    @TvShowScope
    @Provides
    fun provideTvShowViewModelFactory(
        getTvShowsUseCase: GetTvShowsUseCase,
        updateTvShowsUseCase: UpdateTvShowsUseCase
    ): TvShowViewModelFactory {
        return TvShowViewModelFactory(getTvShowsUseCase, updateTvShowsUseCase)
    }
}