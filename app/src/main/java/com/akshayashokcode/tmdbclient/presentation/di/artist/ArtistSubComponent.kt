package com.akshayashokcode.tmdbclient.presentation.di.artist

import com.akshayashokcode.tmdbclient.presentation.artist.ArtistActivity
import dagger.Subcomponent

@ArtistScope
@Subcomponent(
    modules = [ArtistModule::class]
)
interface ArtistSubComponent {
    fun inject(artistActivity:ArtistActivity)
}