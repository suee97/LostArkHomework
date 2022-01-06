package com.example.lostarkcheckcompose.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.lostarkcheckcompose.data.models.Profile
import kotlinx.coroutines.flow.Flow

@Dao
interface ProfileDao {

    @Query("SELECT * FROM profile_table")
    fun getAllProfiles(): Flow<List<Profile>>

    @Insert
    suspend fun addProfile(profile: Profile)

    @Delete
    suspend fun deleteProfile(profile: Profile)

    @Query("DELETE FROM profile_table")
    suspend fun deleteAllProfiles()
}