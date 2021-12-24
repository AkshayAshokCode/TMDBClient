package com.akshayashokcode.tmdbclient.presentation.di

import com.akshayashokcode.tmdbclient.presentation.di.artist.ArtistSubComponent
import com.akshayashokcode.tmdbclient.presentation.di.movie.MovieSubComponent
import com.akshayashokcode.tmdbclient.presentation.di.tvshow.TvShowSubComponent

interface Injector {

    fun createMovieSubComponent():MovieSubComponent
    fun createTvShowSubComponent():TvShowSubComponent
    fun createArtistSubComponent():ArtistSubComponent
}