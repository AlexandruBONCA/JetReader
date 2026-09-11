package com.allmycode.jetreader.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.allmycode.jetreader.screens.SplashScreen
import com.allmycode.jetreader.screens.details.BookDetailsScreen
import com.allmycode.jetreader.screens.home.HomeScreen
import com.allmycode.jetreader.screens.login.LoginScreen
import com.allmycode.jetreader.screens.search.BookSearchScreen
import com.allmycode.jetreader.screens.stats.StatsScreen
import com.allmycode.jetreader.screens.update.BookUpdateScreen

@Composable
fun ReaderNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = ReaderScreens.SplashScreen.name) {
        composable(ReaderScreens.SplashScreen.name) {
            SplashScreen(navController = navController)
        }

        composable(ReaderScreens.HomeScreen.name) {
            HomeScreen(navController = navController)
        }

        composable(ReaderScreens.LoginScreen.name) {
            LoginScreen(navController = navController)
        }

        composable(ReaderScreens.SearchScreen.name) {
            BookSearchScreen(navController = navController)
        }

        composable(ReaderScreens.DetailsScreen.name) {
            BookDetailsScreen(navController = navController)
        }

        composable(ReaderScreens.StatsScreen.name) {
            StatsScreen(navController = navController)
        }

        composable(ReaderScreens.UpdateScreen.name) {
            BookUpdateScreen(navController = navController)
        }
    }
}