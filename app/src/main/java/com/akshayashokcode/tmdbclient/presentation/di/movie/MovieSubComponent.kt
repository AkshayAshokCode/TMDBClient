package com.akshayashokcode.tmdbclient.presentation.di.movie

import com.akshayashokcode.tmdbclient.presentation.movie.MovieActivity
import dagger.Subcomponent

@MovieScope
@Subcomponent(
    modules = [
        MovieModule::class
    ]
)
interface MovieSubComponent {
    fun inject(MovieActivity: MovieActivity)

    @Subcomponent.Factory
    interface Factory {
        fun create(): MovieSubComponent
    }
}