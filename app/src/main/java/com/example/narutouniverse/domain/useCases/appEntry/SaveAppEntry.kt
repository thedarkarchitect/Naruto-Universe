package com.example.narutouniverse.domain.useCases.appEntry

import com.example.narutouniverse.domain.localManager.LocalUserManager

class SaveAppEntry(
    private val localUserManager: LocalUserManager
) {
    suspend operator fun invoke() {
        localUserManager.saveAppEntry()
    }
}