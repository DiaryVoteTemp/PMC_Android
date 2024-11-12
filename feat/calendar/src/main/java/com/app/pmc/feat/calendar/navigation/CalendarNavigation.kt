package com.app.pmc.feat.calendar.navigation

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.app.pmc.feat.calendar.CalendarScreen

const val ROUTE_CALENDAR = "calendar"
@RequiresApi(Build.VERSION_CODES.O)
fun NavGraphBuilder.addCalendarGraph(navController: NavController) {
    composable(ROUTE_CALENDAR) {
        CalendarScreen()
    }
}