package com.akshayashokcode.tmdbclient.presentation.movie

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.akshayashokcode.tmdbclient.domain.usecase.GetMoviesUseCase
import com.akshayashokcode.tmdbclient.domain.usecase.UpdateMoviesUseCase

class MoviesViewModelFactory(
    private val getMoviesUseCase: GetMoviesUseCase,
    private val updateMoviesUseCase: UpdateMoviesUseCase
) :ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MovieViewModel(getMoviesUseCase,updateMoviesUseCase) as T
    }
}