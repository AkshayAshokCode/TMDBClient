package com.akshayashokcode.tmdbclient.presentation.di.core

import com.akshayashokcode.tmdbclient.presentation.di.artist.ArtistSubComponent
import com.akshayashokcode.tmdbclient.presentation.di.movie.MovieSubComponent
import com.akshayashokcode.tmdbclient.presentation.di.tvshow.TvShowSubComponent
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
        NetModule::class,
    RepositoryModule::class,
    UseCaseModule::class,
    DatabaseModule::class,
    LocalDataModule::class,
    RemoteDataModule::class,
    CacheDataModule::class
    ]
)
interface AppComponent {
    fun movieSubComponent():MovieSubComponent.Factory
    fun tvShowSubComponent():TvShowSubComponent.Factory
    fun artistSubComponent():ArtistSubComponent.Factory
}