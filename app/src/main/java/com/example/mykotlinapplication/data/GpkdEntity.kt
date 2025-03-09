package com.example.mykotlinapplication.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "gpkd_table")
data class GpkdEntity(
    @PrimaryKey val number: String
)