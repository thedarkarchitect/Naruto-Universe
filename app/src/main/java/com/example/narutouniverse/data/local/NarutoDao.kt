//package com.example.narutouniverse.data.local
//
//import androidx.room.Dao
//import androidx.room.Delete
//import androidx.room.Insert
//import androidx.room.OnConflictStrategy
//import androidx.room.Query
//import com.example.narutouniverse.domain.model.Characters
//import kotlinx.coroutines.flow.Flow
//
//@Dao
//interface NarutoDao {
//    @Insert(onConflict = OnConflictStrategy.REPLACE)
//    suspend fun upsert(characters: Characters)
//
//    @Delete
//    suspend fun delete(characters: Characters)
//
//    @Query("SELECT * FROM characters")
//    fun getCharacters(): Flow<List<Characters>>
//
//    @Query("SELECT * FROM characters WHERE id = :id")
//    suspend fun getCharacter(id: Int): Characters
//}