package com.akshayashokcode.tmdbclient.presentation.di.core

import com.akshayashokcode.tmdbclient.data.repository.artist.ArtistRepositoryImpl
import com.akshayashokcode.tmdbclient.data.repository.artist.datasource.ArtistCacheDataSource
import com.akshayashokcode.tmdbclient.data.repository.artist.datasource.ArtistLocalDataSource
import com.akshayashokcode.tmdbclient.data.repository.artist.datasource.ArtistRemoteDataSource
import com.akshayashokcode.tmdbclient.data.repository.movie.MovieRepositoryImpl
import com.akshayashokcode.tmdbclient.data.repository.movie.datasource.MovieCacheDataSource
import com.akshayashokcode.tmdbclient.data.repository.movie.datasource.MovieLocalDataSource
import com.akshayashokcode.tmdbclient.data.repository.movie.datasource.MovieRemoteDataSource
import com.akshayashokcode.tmdbclient.data.repository.tvshow.TvShowRepositoryImpl
import com.akshayashokcode.tmdbclient.data.repository.tvshow.datasource.TvShowCacheDataSource
import com.akshayashokcode.tmdbclient.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.akshayashokcode.tmdbclient.data.repository.tvshow.datasource.TvShowRemoteDataSource
import com.akshayashokcode.tmdbclient.domain.repository.ArtistRepository
import com.akshayashokcode.tmdbclient.domain.repository.MovieRepository
import com.akshayashokcode.tmdbclient.domain.repository.TvShowRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Singleton
    @Provides
    fun provideMovieRepository(
        movieRemoteDataSource: MovieRemoteDataSource,
        movieCacheDataSource: MovieCacheDataSource,
        movieLocalDataSource: MovieLocalDataSource
    ):MovieRepository{
        return MovieRepositoryImpl(movieRemoteDataSource, movieLocalDataSource, movieCacheDataSource)
    }

    @Singleton
    @Provides
    fun provideTvShowRepository(
       tvShowRemoteDataSource: TvShowRemoteDataSource,
       tvShowLocalDataSource: TvShowLocalDataSource,
       tvShowCacheDataSource: TvShowCacheDataSource
    ):TvShowRepository{
        return TvShowRepositoryImpl(tvShowRemoteDataSource, tvShowLocalDataSource, tvShowCacheDataSource)
    }

    @Singleton
    @Provides
    fun provideArtistRepository(
       artistRemoteDataSource: ArtistRemoteDataSource,
       artistLocalDataSource: ArtistLocalDataSource,
       artistCacheDataSource: ArtistCacheDataSource
    ):ArtistRepository{
        return ArtistRepositoryImpl(artistRemoteDataSource, artistLocalDataSource, artistCacheDataSource)
    }
}