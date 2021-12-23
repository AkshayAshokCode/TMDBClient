package com.akshayashokcode.tmdbclient.presentation.di.core

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
}