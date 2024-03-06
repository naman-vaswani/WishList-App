package com.example.mywishlistapp

import android.content.Context
import androidx.room.Room
import com.example.mywishlistapp.data.WishDatabase
import com.example.mywishlistapp.data.WishRepository

object Graph {
    lateinit var database : WishDatabase

    val wishRepository by lazy{
        // lazy just makes sure that this variable is only initiallized once it is goinf to be needed,
        // so the idea behind this is you dont load everything the moment you start your application, but only the moment you need it

        WishRepository(wishDao = database.wishDao())
    }


    // This will build our database the  moment we call provide() function.
    fun provide(context : Context){
        database = Room.databaseBuilder(context , WishDatabase :: class.java , "wishlist.db").build()
    }

}