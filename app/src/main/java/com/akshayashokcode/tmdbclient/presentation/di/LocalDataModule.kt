package com.akshayashokcode.tmdbclient.presentation.di

import com.akshayashokcode.tmdbclient.data.db.ArtistDao
import com.akshayashokcode.tmdbclient.data.db.MovieDao
import com.akshayashokcode.tmdbclient.data.db.TvShowDao
import com.akshayashokcode.tmdbclient.data.repository.artist.datasource.ArtistLocalDataSource
import com.akshayashokcode.tmdbclient.data.repository.artist.datasourceImpl.ArtistLocalDataSourceImpl
import com.akshayashokcode.tmdbclient.data.repository.movie.datasource.MovieLocalDataSource
import com.akshayashokcode.tmdbclient.data.repository.movie.datasourceImpl.MovieLocalDataSourceImpl
import com.akshayashokcode.tmdbclient.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.akshayashokcode.tmdbclient.data.repository.tvshow.datasource.TvShowRemoteDataSource
import com.akshayashokcode.tmdbclient.data.repository.tvshow.datasourceImpl.TvShowLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LocalDataModule {

    @Singleton
    @Provides
    fun provideMovieLocalDataSource(movieDao: MovieDao):MovieLocalDataSource{
        return MovieLocalDataSourceImpl(movieDao)
    }
    @Singleton
    @Provides
    fun provideTvShowLocalDataSource(tvShowDao: TvShowDao):TvShowLocalDataSource{
        return TvShowLocalDataSourceImpl(tvShowDao)
    }
    @Singleton
    @Provides
    fun provideArtistLocalDataSource(artistDao: ArtistDao):ArtistLocalDataSource{
        return ArtistLocalDataSourceImpl(artistDao)
    }
}