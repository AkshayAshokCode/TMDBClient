package com.akshayashokcode.tmdbclient.presentation.di.artist

import com.akshayashokcode.tmdbclient.domain.usecase.GetArtistsUseCase
import com.akshayashokcode.tmdbclient.domain.usecase.UpdateArtistsUseCase
import com.akshayashokcode.tmdbclient.presentation.artist.ArtistViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class ArtistModule {

    @ArtistScope
    @Provides
    fun provideArtistViewModelFactory(
        getArtistsUseCase: GetArtistsUseCase,
        updateArtistsUseCase: UpdateArtistsUseCase
    ): ArtistViewModelFactory {
        return ArtistViewModelFactory(getArtistsUseCase, updateArtistsUseCase)
    }
}