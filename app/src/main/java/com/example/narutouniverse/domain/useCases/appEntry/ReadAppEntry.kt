package com.example.narutouniverse.domain.useCases.appEntry

import com.example.narutouniverse.domain.localManager.LocalUserManager
import kotlinx.coroutines.flow.Flow

class ReadAppEntry(
    private val localUserManager: LocalUserManager
) {
    operator fun invoke(): Flow<Boolean> { // we return cause this class will give a value to be used
        return localUserManager.readAppEntry()
    }
}