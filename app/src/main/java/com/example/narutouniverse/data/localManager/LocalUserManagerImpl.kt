package com.example.narutouniverse.data.localManager

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.preferencesDataStore
import com.example.narutouniverse.domain.localManager.LocalUserManager
import com.example.narutouniverse.utils.Constants
import com.example.narutouniverse.utils.Constants.USER_SETTINGS
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class LocalUserManagerImpl(
    private val context: Context
) : LocalUserManager {
    override suspend fun saveAppEntry() {
       context.dataStore.edit { settings ->
           settings[PreferencesKeys.APP_ENTRY] = true //here we are getting the set value
       }
    }

    override fun readAppEntry(): Flow<Boolean> {
        return context.dataStore.data.map {  preferences -> //here we are reading and then setting the value
            preferences[PreferencesKeys.APP_ENTRY] ?: false
        }
    }
}

private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = USER_SETTINGS)

private object PreferencesKeys {
    val APP_ENTRY = booleanPreferencesKey(name = Constants.APP_ENTRY)
}