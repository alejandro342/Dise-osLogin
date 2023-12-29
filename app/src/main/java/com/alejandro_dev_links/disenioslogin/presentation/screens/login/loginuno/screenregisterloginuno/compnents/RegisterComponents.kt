package com.alejandro_dev_links.disenioslogin.presentation.screens.login.loginuno.screenregisterloginuno.compnents

import androidx.compose.foundation.background
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandCircleDown
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.PhoneAndroid
import androidx.compose.material.icons.outlined.VpnKey
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.alejandro_dev_links.disenioslogin.R
import com.alejandro_dev_links.disenioslogin.presentation.mycomponents.DefaultTextField
import com.alejandro_dev_links.disenioslogin.presentation.mycomponents.ImageWithCircleBorder
import com.alejandro_dev_links.disenioslogin.ui.theme.DiseniosLoginTheme
import com.alejandro_dev_links.disenioslogin.ui.theme.GrayVariant
import com.alejandro_dev_links.disenioslogin.ui.theme.PrimaryBlue

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegisterComponents() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Card(
            modifier = Modifier
                .fillMaxHeight(0.5f),
            colors = CardDefaults.cardColors(
                containerColor = PrimaryBlue,
                contentColor = Color.Black
            ),
            elevation = CardDefaults.cardElevation(20.dp),
            shape = RoundedCornerShape(
                topStart = 0.dp,
                topEnd = 0.dp,
                bottomStart = 30.dp,
                bottomEnd = 30.dp
            )
        ) {
            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth()
                    .background(PrimaryBlue),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.fillMaxHeight(0.1f))
                ImageWithCircleBorder(
                    painterResource(id = R.drawable.ic_down),
                    contentDescription = null
                )
                Text(
                    text = "REGISTER",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
                Spacer(modifier = Modifier.fillMaxHeight(1f))
            }
        }
        Box(
            modifier = Modifier
                .fillMaxHeight(1f)
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
                .background(Color.Transparent)
                .align(alignment = Alignment.Center)
        ) {
            Card(
                modifier = Modifier
                    .offset(y = 180.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White,
                    contentColor = Color.Black
                ),
                elevation = CardDefaults.cardElevation(20.dp),
                shape = RoundedCornerShape(
                    topStart = 30.dp,
                    topEnd = 30.dp,
                    bottomStart = 30.dp,
                    bottomEnd = 30.dp
                )
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Spacer(modifier = Modifier.height(20.dp))
                    DefaultTextField(
                        modifier = Modifier.padding(10.dp),
                        value = "",
                        onChangedValueText = {},
                        label = "Full Name",
                        colors = TextFieldDefaults.textFieldColors(
                            containerColor = Color(0xFFFAFAFA),
                            textColor = GrayVariant
                        ),
                        icon = Icons.Outlined.Person
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    DefaultTextField(
                        modifier = Modifier.padding(10.dp),
                        value = "",
                        onChangedValueText = {},
                        label = "Username / Email",
                        colors = TextFieldDefaults.textFieldColors(
                            containerColor = Color(0xFFFAFAFA),
                            textColor = GrayVariant
                        ),
                        icon = Icons.Outlined.Email
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    DefaultTextField(
                        modifier = Modifier.padding(10.dp),
                        value = "",
                        onChangedValueText = {},
                        label = "Phone Number",
                        colors = TextFieldDefaults.textFieldColors(
                            containerColor = Color(0xFFFAFAFA),
                            textColor = GrayVariant
                        ),
                        icon = Icons.Outlined.PhoneAndroid
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    DefaultTextField(
                        modifier = Modifier.padding(10.dp),
                        value = "",
                        onChangedValueText = {},
                        label = "Password",
                        colors = TextFieldDefaults.textFieldColors(
                            containerColor = Color(0xFFFAFAFA),
                            textColor = GrayVariant
                        ),
                        icon = Icons.Outlined.VpnKey
                    )
                    Spacer(modifier = Modifier.height(15.dp))
                    Button(modifier = Modifier.width(200.dp),
                        colors = ButtonDefaults
                            .buttonColors(
                                containerColor = PrimaryBlue
                            ),
                        onClick = { }
                    ) {
                        Text(
                            text = "Sing Up",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    }
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ) {

                        Text(text = "Already A Member? ")
                        Text(text = " Sing as", color = Color.Blue)
                    }
                }
                Spacer(modifier = Modifier.fillMaxHeight(0.1f))
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomStart)
                .padding(bottom = 30.dp),
            horizontalArrangement = Arrangement.Start
        ) {
            Card(
                modifier = Modifier
                    .width(80.dp)
                    .height(50.dp),
                colors = CardDefaults.cardColors(
                    containerColor = PrimaryBlue,
                    contentColor = Color.Black
                ),
                elevation = CardDefaults.cardElevation(20.dp),
                shape = RoundedCornerShape(
                    topStart = 0.dp,
                    topEnd = 30.dp,
                    bottomStart = 0.dp,
                    bottomEnd = 30.dp
                )
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                        .fillMaxWidth(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.End
                ) {
                    Icon(
                        imageVector = Icons.Default.ExpandCircleDown,
                        contentDescription = null,
                        modifier = Modifier
                            .padding(end = 5.dp)
                            .rotate(90f)
                            .size(40.dp),
                        tint = Color.White
                    )
                }
            }
        }
    }
}

@Composable
@Preview
fun RegisterComponentsPreview() {
    DiseniosLoginTheme {
        RegisterComponents()
    }
}