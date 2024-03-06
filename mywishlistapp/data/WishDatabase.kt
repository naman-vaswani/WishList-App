package com.example.mywishlistapp.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [Wish :: class],
    version = 1, // 1 because its the first database we are creating
    exportSchema = false
)

abstract class WishDatabase : RoomDatabase() {
    abstract fun wishDao (): WishDao
}