package com.app.pmc.feat.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.app.pmc.core.ui.R.drawable
import com.app.pmc.core.ui.surface.GradientSurface

@Composable
fun SplashScreen() {
    GradientSurface{
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
           Image(
               modifier = Modifier.height(39.dp).width(106.dp),
               painter = painterResource(id = drawable.ic_app_name),
               contentDescription = "App Logo"
           )
        }
    }
}

@Composable
@Preview(showBackground = true)
fun SplashScreenPreview() {
    SplashScreen()
}