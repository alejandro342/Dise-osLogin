package com.alejandro_dev_links.disenioslogin.presentation.screens.login.loginuno.screenloginuno.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandCircleDown
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.VpnKey
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
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
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.alejandro_dev_links.disenioslogin.R
import com.alejandro_dev_links.disenioslogin.presentation.mycomponents.DefaultTextField
import com.alejandro_dev_links.disenioslogin.presentation.mycomponents.ImageWithCircleBorder
import com.alejandro_dev_links.disenioslogin.presentation.navigation.screen.auth.AuthScreen
import com.alejandro_dev_links.disenioslogin.ui.theme.GrayVariant
import com.alejandro_dev_links.disenioslogin.ui.theme.PrimaryBlue

//Este sera nuestro contenedor del diseño de nuestra vista

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginUnoContent(navController: NavHostController) {
    var mPasswordView by remember { mutableStateOf(false) }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Card(
            modifier = Modifier
                .fillMaxHeight(0.5f),
            colors = CardDefaults.cardColors(
                containerColor = PrimaryBlue
            ),
            elevation = CardDefaults.cardElevation(20.dp),
            shape = RoundedCornerShape(
                topStart = 0.dp,
                topEnd = 0.dp,
                bottomStart = 20.dp,
                bottomEnd = 20.dp
            )
        ) {
            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.weight(0.3f))
                ImageWithCircleBorder(
                    painterResource(id = R.drawable.ic_down),
                    contentDescription = null,
                    modifier = Modifier
                        .size(80.dp)
                )
                Text(
                    text = "WELCOME!!",
                    fontSize = 35.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
                Spacer(modifier = Modifier.weight(1f))
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
            Card(
                modifier = Modifier
                    .offset(y = 50.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                ),
                elevation = CardDefaults.cardElevation(30.dp),
                shape = RoundedCornerShape(
                    topStart = 30.dp,
                    topEnd = 30.dp,
                    bottomStart = 30.dp,
                    bottomEnd = 30.dp
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
                            .padding(10.dp),
                        value = "",
                        onChangedValueText = {},
                        label = "Username/Email",
                        colors = TextFieldDefaults.textFieldColors(
                            containerColor = Color(0xFFFAFAFA),
                            textColor = GrayVariant
                        ),
                        icon = Icons.Outlined.Email
                    )
                    Spacer(modifier = Modifier.height(15.dp))
                    TextField(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp),
                        shape = RoundedCornerShape(16.dp),
                        value = "",
                        onValueChange = { },
                        label = { Text(text = "Contraseña") },
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                        colors = TextFieldDefaults.textFieldColors(
                            containerColor = Color(0xFFFAFAFA),
                            textColor = Color.Black
                        ),
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Outlined.VpnKey,
                                contentDescription = "Icon email",
                                tint = GrayVariant
                            )
                        },
                        trailingIcon = {//para mostrar el icono de ver y ocultar password
                            val imagen = if (mPasswordView) {
                                Icons.Filled.VisibilityOff
                            } else {
                                Icons.Filled.Visibility
                            }
                            IconButton(onClick = { mPasswordView = !mPasswordView }) {
                                Icon(
                                    imageVector = imagen,
                                    contentDescription = "view password"
                                ) //icono
                            }
                        },
                        visualTransformation = if (mPasswordView) {
                            VisualTransformation.None
                        } else {
                            PasswordVisualTransformation()
                        }
                    )
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp)
                    ) {
                        Text(text = "Forgot password?")
                    }
                    Spacer(modifier = Modifier.fillMaxHeight(0.1f))
                    Button(modifier = Modifier
                        .width(200.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = PrimaryBlue
                        ),
                        onClick = { }) {
                        Text(text = "Login", fontSize = 15.sp, color = Color.White)
                    }
                    Spacer(modifier = Modifier.height(15.dp))
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Text(text = "Don´t have Account? ")
                        Text(text = " Register", color = Color.Blue)
                    }
                }
                Spacer(modifier = Modifier.fillMaxHeight(0.1f))
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clickable {
                    navController.navigate(route = AuthScreen.Register1.route)
                }
                .align(Alignment.BottomEnd)
                .padding(bottom = 30.dp),
            horizontalArrangement = Arrangement.End
        ) {
            Card(
                modifier = Modifier
                    .width(80.dp)
                    .height(50.dp),
                colors = CardDefaults.cardColors(
                    containerColor = PrimaryBlue
                ),
                elevation = CardDefaults.cardElevation(20.dp),
                shape = RoundedCornerShape(
                    topStart = 30.dp,
                    topEnd = 0.dp,
                    bottomStart = 30.dp,
                    bottomEnd = 0.dp
                )
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.Start
                ) {
                    Icon(
                        imageVector = Icons.Default.ExpandCircleDown,
                        contentDescription = null,
                        modifier = Modifier
                            .padding(start = 5.dp)
                            .size(40.dp)
                            .rotate(270f),
                        tint = Color.White
                    )
                }
            }
        }
    }
}