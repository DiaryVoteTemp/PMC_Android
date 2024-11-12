package com.app.pmc.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.app.pmc.feat.calendar.navigation.ROUTE_CALENDAR
import com.app.pmc.feat.calendar.navigation.addCalendarGraph

@Composable
fun PMCNavHost(
    navController: NavHostController
) {
    NavHost(navController = navController, startDestination = ROUTE_CALENDAR) {
        addCalendarGraph(navController = navController)
    }
}