package com.alejandro_dev_links.disenioslogin.presentation.screens.login.logintres.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.alejandro_dev_links.disenioslogin.ui.theme.BlueV4
import com.alejandro_dev_links.disenioslogin.ui.theme.DiseniosLoginTheme
import com.alejandro_dev_links.disenioslogin.ui.theme.OrangeV4
import com.alejandro_dev_links.disenioslogin.ui.theme.PinkV4

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun VistaCuatroLoginTresContent() {

    var isChecked by remember { mutableStateOf(false) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(OrangeV4, PinkV4)
                )
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.fillMaxHeight(0.1f))

        Icon(
            imageVector = Icons.Outlined.Person,
            contentDescription = null,
            modifier = Modifier
                .size(150.dp)
                .clip(CircleShape)
                .background(Color.White),
            tint = OrangeV4
        )

        Spacer(modifier = Modifier.fillMaxHeight(0.1f))
        Text(
            text = "MEMBER LOGIN",
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp
        )
        Spacer(modifier = Modifier.fillMaxHeight(0.1f))
        TextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 30.dp)
                .clip(RoundedCornerShape(30.dp))
                .border(3.dp, Color.White, shape = CircleShape)
                .clipToBounds(),
            shape = RoundedCornerShape(30),
            value = "",
            onValueChange = {},
            placeholder = {
                Text(
                    text = "Username", color = Color.White,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                )
            },
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color.Transparent,
                textColor = Color.Black
            )
        )
        Spacer(modifier = Modifier.fillMaxHeight(0.1f))
        TextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 30.dp)
                .clip(RoundedCornerShape(30.dp))
                .border(3.dp, Color.White, shape = CircleShape)
                .clipToBounds(),
            value = "",
            onValueChange = {},
            placeholder = {
                Text(
                    text = "***********", color = Color.White,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                )
            },
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color.Transparent,
                textColor = Color.Black
            )
        )
        Spacer(modifier = Modifier.fillMaxHeight(0.1f))
        Button(
            onClick = { }, modifier = Modifier
                .width(230.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = BlueV4,
                contentColor = Color.White
            )
        ) {
            Text(text = "LOGIN")
        }
        Spacer(modifier = Modifier.fillMaxHeight(0.1f))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 30.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Checkbox(
                checked = isChecked, onCheckedChange = { isChecked = it },
                modifier = Modifier, colors = CheckboxDefaults.colors(
                    checkedColor = Color.White,
                    disabledUncheckedColor = Color.White
                )
            )
            Text(text = "Remember", color = Color.White)
            Spacer(modifier = Modifier.weight(1f))
            Text(text = "Forgot password?", color = Color.White)
        }
        Spacer(modifier = Modifier.fillMaxHeight(0.1f))
        Text(
            text = "Not a member?", color = Color.White, textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
        )
        Button(
            onClick = { }, modifier = Modifier
                .width(230.dp),
            colors = ButtonDefaults.buttonColors(
                contentColor = BlueV4,
                containerColor = Color.Transparent
            ),
            border = BorderStroke(2.dp, BlueV4)
        ) {
            Text(text = "Create Account", color = BlueV4)
        }
        Spacer(modifier = Modifier.fillMaxHeight(0.1f))
    }
}

@Composable
@Preview
fun VistaCuatroLoginTresContentPreview() {
    DiseniosLoginTheme {
        VistaCuatroLoginTresContent()
    }
}