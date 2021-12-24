package com.akshayashokcode.tmdbclient.presentation.di.movie

import com.akshayashokcode.tmdbclient.domain.usecase.GetMoviesUseCase
import com.akshayashokcode.tmdbclient.domain.usecase.UpdateMoviesUseCase
import com.akshayashokcode.tmdbclient.presentation.movie.MoviesViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class MovieModule {

    @MovieScope
    @Provides
    fun provideMovieViewModelFactory(
        getMoviesUseCase: GetMoviesUseCase,
        updateMoviesUseCase: UpdateMoviesUseCase
    ): MoviesViewModelFactory {
        return MoviesViewModelFactory(getMoviesUseCase, updateMoviesUseCase)
    }
}