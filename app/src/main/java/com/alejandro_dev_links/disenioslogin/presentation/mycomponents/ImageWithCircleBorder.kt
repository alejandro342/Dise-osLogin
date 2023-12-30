package com.alejandro_dev_links.disenioslogin.presentation.mycomponents

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp

@Composable
fun ImageWithCircleBorder(
    painter: Painter,
    contentDescription: String?,
    modifier: Modifier = Modifier
) {
    Box(modifier = modifier.drawWithContent {
        drawContent()
        drawCircle(
            color = Color.White,
            center = center,
            radius = size.minDimension / 2,
            style = Stroke(2.dp.toPx())
        )
    }) {
        Image(
            painter = painter,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }
}