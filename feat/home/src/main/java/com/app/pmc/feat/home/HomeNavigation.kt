package com.app.pmc.feat.home

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val ROUTE_HOME = "home"
fun NavGraphBuilder.addHomeGraph(navController: NavController) {
    composable(ROUTE_HOME) {
        HomeScreen()
    }
}