package com.example.mykotlinapplication.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.mykotlinapplication.data.GpkdEntity

@Dao
interface GpkdDao {

    // Check if a given GPKD number already exists in the database
    @Query("SELECT COUNT(*) FROM gpkd_table WHERE number = :gpkdNumber")
    suspend fun isGpkdUsed(gpkdNumber: String): Int

    // Insert a new GPKD entry into the database
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertGpkd(gpkdEntity: GpkdEntity)

    // Retrieve all stored GPKD numbers
    @Query("SELECT * FROM gpkd_table")
    suspend fun getAllGpkd(): List<GpkdEntity>

    // Delete all entries (if needed)
    @Query("DELETE FROM gpkd_table")
    suspend fun clearAll()
}