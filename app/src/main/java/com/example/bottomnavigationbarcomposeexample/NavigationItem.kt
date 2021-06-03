package com.example.bottomnavigationbarcomposeexample

sealed class NavigationItem(var route: String, var icon: Int, var title: String) {
    object Home : NavigationItem("home", R.drawable.ic_home, "Home")
    object Music : NavigationItem("music", R.drawable.ic_music, "Music")
    object Movies : NavigationItem("movies", R.drawable.ic_movie, "Movies")
    object Books : NavigationItem("books", R.drawable.ic_book, "Books")
    object Profile : NavigationItem("profile", R.drawable.ic_profile, "Profile")
}