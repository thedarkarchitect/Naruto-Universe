package com.example.narutouniverse.di

import android.app.Application
import com.example.narutouniverse.data.localManager.LocalUserManagerImpl
import com.example.narutouniverse.domain.localManager.LocalUserManager
import com.example.narutouniverse.domain.useCases.appEntry.AppEntryUsesCases
import com.example.narutouniverse.domain.useCases.appEntry.ReadAppEntry
import com.example.narutouniverse.domain.useCases.appEntry.SaveAppEntry
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
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



}