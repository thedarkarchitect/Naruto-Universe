package com.example.narutouniverse.di

import android.app.Application
import com.example.narutouniverse.data.localManager.LocalUserManagerImpl
import com.example.narutouniverse.data.remote.NarutoApi
import com.example.narutouniverse.data.repository.NarutoRepositoryImpl
import com.example.narutouniverse.domain.localManager.LocalUserManager
import com.example.narutouniverse.domain.repository.NarutoRepository
import com.example.narutouniverse.domain.useCases.appEntry.AppEntryUsesCases
import com.example.narutouniverse.domain.useCases.appEntry.ReadAppEntry
import com.example.narutouniverse.domain.useCases.appEntry.SaveAppEntry
import com.example.narutouniverse.utils.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providesLocalManager(
        application: Application
    ): LocalUserManager{
        return LocalUserManagerImpl(application)
    }

    @Provides
    @Singleton
    fun providesAppEntryUseCases(
        localUserManager: LocalUserManager
    ): AppEntryUsesCases{
        return AppEntryUsesCases(
            saveAppEntry = SaveAppEntry(localUserManager),
            readAppEntry = ReadAppEntry(localUserManager)
        )
    }

    @Provides
    @Singleton
    fun provideRetrofit(): NarutoApi {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(NarutoApi::class.java)
    }

    @Provides
    @Singleton
    fun providesNarutoRepository(api: NarutoApi): NarutoRepository = NarutoRepositoryImpl(api)
}