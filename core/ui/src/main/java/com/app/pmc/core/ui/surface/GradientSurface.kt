package com.app.pmc.core.ui.surface

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.app.pmc.core.ui.R


@Composable
fun GradientSurface(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    Box(modifier) {
        TopGradientCircle(
            modifier = Modifier.fillMaxSize()
        )
        BottomGradientCircle(
            modifier = Modifier.fillMaxSize()
        )
        content()
    }
}

@Composable
private fun TopGradientCircle(
    modifier: Modifier = Modifier
) {
    Box(modifier) {
        Image(
            painter = painterResource(id = R.drawable.image_home_gradient_top_end_background),
            contentDescription = "Background",
            modifier = Modifier.fillMaxSize()
        )
        Image(
            painter = painterResource(id = R.drawable.image_home_gradient_top_center),
            contentDescription = "Background",
            modifier = Modifier.fillMaxSize()
        )
    }
}

@Composable
private fun BottomGradientCircle(
    modifier: Modifier = Modifier
) {
    Box(modifier) {
        Image(
            painter = painterResource(id = R.drawable.image_home_gradient_bottom_background),
            contentDescription = "Background",
            modifier = Modifier.fillMaxSize()
        )
        Image(
            painter = painterResource(id = R.drawable.image_home_gradient_bottom_center),
            contentDescription = "Background",
            modifier = Modifier.fillMaxSize()
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun GradientSurfacePreview() {
    GradientSurface {
        // Preview content
    }
}