package com.alejandro_dev_links.disenioslogin.presentation.mycomponents

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.alejandro_dev_links.disenioslogin.ui.theme.BluePastel

@Composable
fun RoundedPersonImage() {
    Box(
        modifier = Modifier
            .size(80.dp)
            .background(BluePastel, shape = CircleShape)
    ) {
        Image(
            imageVector = Icons.Outlined.Person,
            contentDescription = null,
            modifier = Modifier
                .size(56.dp)
                .background(Color.White, CircleShape)
                .align(Alignment.Center)
        )
    }
}