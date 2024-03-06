package com.example.mywishlistapp.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
abstract class WishDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    abstract suspend fun addAWish(wishEntity : Wish) // abstract functions does not need body/any implementations.

    // Loads all wishes from the wish table
    @Query("Select * from `wish-table`")
    abstract fun getAllWishes(): Flow<List<Wish>>

    @Update
    abstract suspend fun updateAWish(wishEntity: Wish)

    @Delete
    abstract suspend fun deleteAWish(wishEntity: Wish)

    @Query("Select * from `wish-table` where id =:id ")
    abstract fun getAWishById(id:Long): Flow<Wish>

}

// Foe the query operation, they use the Flow reactive stream which is like LiveData. It is a part
// of the kotlin coroutine library and is designed to provide a simple and efficient way to handle
// asynchronous data streams in a reactive way.