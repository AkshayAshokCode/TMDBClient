package com.akshayashokcode.tmdbclient.data.db

import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.akshayashokcode.tmdbclient.data.model.tvshow.TvShow

interface TvShowDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveTvShows(tvShows: List<TvShow>)

    @Query("DELETE FROM popular_tvShows")
    suspend fun deleteTvShows()

    @Query("SELECT * FROM popular_tvShows")
    suspend fun getTvShows(tvShows: List<TvShow>)
}