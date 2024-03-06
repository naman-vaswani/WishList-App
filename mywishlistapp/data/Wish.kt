package com.example.mywishlistapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true)  //primary column, This entity will be unique for each entry
    val id : Long = 0L,
    @ColumnInfo(name="wish-title")  // Secondary column
    val title : String = "",
    @ColumnInfo(name="wish-desc")  // Third column
    val description : String = ""
)

object DummyWish{
    val wishList = listOf(
        Wish(title = "Bc" , description = "Behenchod"),
        Wish(title = "Mc" , description = "Madarchod"),
        Wish(title = "dc" , description = "Daichod"),
        Wish(title = "chu" , description = "Chutiye")

    )
}
