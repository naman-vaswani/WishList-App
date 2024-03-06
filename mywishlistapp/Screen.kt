package com.example.mywishlistapp
 // This Class contains route for the navigation.
sealed class Screen(val route : String) {
    object HomeScreen : Screen("home_screen")
    object AddScreen : Screen("add_screen")
}