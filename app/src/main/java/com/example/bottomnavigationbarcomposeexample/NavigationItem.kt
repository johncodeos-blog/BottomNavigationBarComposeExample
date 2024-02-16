package com.example.bottomnavigationbarcomposeexample

sealed class NavigationItem(var route: String, var icon: Int, var title: String) {
    data object Home : NavigationItem("home", R.drawable.ic_home, "Home")
    data object Music : NavigationItem("music", R.drawable.ic_music, "Music")
    data object Movies : NavigationItem("movies", R.drawable.ic_movie, "Movies")
    data object Books : NavigationItem("books", R.drawable.ic_book, "Books")
    data object Profile : NavigationItem("profile", R.drawable.ic_profile, "Profile")
}