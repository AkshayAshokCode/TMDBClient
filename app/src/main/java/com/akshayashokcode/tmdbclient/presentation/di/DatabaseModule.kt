package com.akshayashokcode.tmdbclient.presentation.di

import android.content.Context
import androidx.room.Room
import com.akshayashokcode.tmdbclient.data.db.ArtistDao
import com.akshayashokcode.tmdbclient.data.db.MovieDao
import com.akshayashokcode.tmdbclient.data.db.TMDBDatabase
import com.akshayashokcode.tmdbclient.data.db.TvShowDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {
    @Singleton
    @Provides
    fun provideMovieDatabase(context:Context):TMDBDatabase{
        return Room.databaseBuilder(context,TMDBDatabase::class.java,"TMDBClient")
            .build()
    }

    @Singleton
    @Provides
    fun provideMovieDao(tmdbDatabase: TMDBDatabase):MovieDao{
        return tmdbDatabase.movieDao()
    }
    @Singleton
    @Provides
    fun provideTvShowDao(tmdbDatabase: TMDBDatabase):TvShowDao{
        return tmdbDatabase.tvShowDao()
    }
    @Singleton
    @Provides
    fun provideArtistDao(tmdbDatabase: TMDBDatabase):ArtistDao{
        return tmdbDatabase.artistDao()
    }

}