package com.alejandro_dev_links.disenioslogin.presentation.screens.login.logindos.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.GenericShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.VpnKey
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alejandro_dev_links.disenioslogin.presentation.mycomponents.DefaultTextField
import com.alejandro_dev_links.disenioslogin.presentation.mycomponents.RoundedPersonImage
import com.alejandro_dev_links.disenioslogin.ui.theme.BlueCircle
import com.alejandro_dev_links.disenioslogin.ui.theme.BluePastel
import com.alejandro_dev_links.disenioslogin.ui.theme.DiseniosLoginTheme
import com.alejandro_dev_links.disenioslogin.ui.theme.GrayVariant
import com.alejandro_dev_links.disenioslogin.ui.theme.OrangePrimary

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginContentDos() {
    var checkedState by remember { mutableStateOf(true) }
    var mPasswordView by remember { mutableStateOf(false) }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(BluePastel)
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .graphicsLayer(
                    clip = true,
                    shape = GenericShape { size, _ ->
                        moveTo(0f, 0f)
                        lineTo(size.width, 0f)
                        lineTo(size.width, size.height)
                        lineTo(0f, size.height * 0.6f)
                        close()
                    }
                ),
            shape = RoundedCornerShape(
                topStart = 0.dp,
                topEnd = 0.dp,
                bottomStart = 0.dp,
                bottomEnd = 0.dp
            ),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            )
        ) {
        }
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.45f)
                .padding(bottom = 30.dp)
                .graphicsLayer(
                    clip = true,
                    shape = GenericShape { size, _ ->
                        moveTo(0f, 0f)
                        lineTo(size.width, 0f)
                        lineTo(size.width, size.height)
                        lineTo(0f, size.height * 0.0f)
                        close()
                    }
                )
                .align(Alignment.BottomCenter),
            shape = RoundedCornerShape(
                topStart = 0.dp,
                topEnd = 0.dp,
                bottomStart = 0.dp,
                bottomEnd = 0.dp
            ),
            colors = CardDefaults.cardColors(
                containerColor = OrangePrimary
            )
        ) {
        }
        Box(
            modifier = Modifier
                .padding(horizontal = 20.dp)
                .fillMaxWidth()
                .fillMaxHeight(1f)
                .background(Color.Transparent),
            contentAlignment = Alignment.Center
        ) {
            Card(
                modifier = Modifier,
                elevation = CardDefaults.cardElevation(20.dp),
                shape = RoundedCornerShape(
                    topStart = 0.dp,
                    topEnd = 0.dp,
                    bottomStart = 0.dp,
                    bottomEnd = 0.dp
                ),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White,
                    contentColor = Color.Black
                )
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Spacer(modifier = Modifier.fillMaxHeight(0.1f))
                    DefaultTextField(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 20.dp),
                        value = "",
                        onChangedValueText = {},
                        label = "Login",
                        colors = TextFieldDefaults.textFieldColors(
                            containerColor = Color.White,
                            textColor = Color.Black
                        ),
                        icon = Icons.Outlined.Person
                    )
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 20.dp),
                        horizontalArrangement = Arrangement.End
                    ) {
                        Switch(
                            checked = checkedState,
                            onCheckedChange = { checkedState = it },
                            colors = SwitchDefaults.colors(
                                checkedThumbColor = BlueCircle,
                                checkedTrackColor = BluePastel,
                                uncheckedThumbColor = MaterialTheme.colorScheme.secondary,
                                uncheckedTrackColor = MaterialTheme.colorScheme.secondary.copy(alpha = 0.5f),
                            )
                        )
                    }
                    Spacer(modifier = Modifier.fillMaxHeight(0.1f))
                    TextField(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(20.dp),
                        shape = RoundedCornerShape(16.dp),
                        value = "",
                        onValueChange = { },
                        label = { Text(text = "Contraseña") },
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                        colors = TextFieldDefaults.textFieldColors(
                            containerColor = Color.White,
                            textColor = Color.Black
                        ),
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Outlined.VpnKey,
                                contentDescription = "Icon email",
                                tint = GrayVariant
                            )
                        },
                        trailingIcon = {
                            val imagen = if (mPasswordView) {
                                Icons.Filled.VisibilityOff
                            } else {
                                Icons.Filled.Visibility
                            }
                            IconButton(onClick = { mPasswordView = !mPasswordView }) {
                                Icon(
                                    imageVector = imagen,
                                    contentDescription = "view password"
                                )
                            }
                        },
                        visualTransformation = if (mPasswordView) {
                            VisualTransformation.None
                        } else {
                            PasswordVisualTransformation()
                        }
                    )

                    Button(modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = OrangePrimary
                        ),
                        shape = RoundedCornerShape(
                            0
                        ),
                        onClick = {}
                    ) {
                        Text(text = "Sing In", color = Color.White)
                    }
                }
                Spacer(modifier = Modifier.fillMaxHeight(0.1f))
            }
        }
        Box(
            modifier = Modifier
                .padding(horizontal = 20.dp)
                .fillMaxWidth()
                .fillMaxHeight(1f)
                .background(Color.Transparent),
            contentAlignment = Alignment.Center
        ) {
            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.fillMaxHeight(0.18f))
                RoundedPersonImage()
            }
        }
    }
}

@Composable
@Preview
fun LoginContentDosPreview() {
    DiseniosLoginTheme {
        LoginContentDos()
    }
}