package com.alejandro_dev_links.disenioslogin.presentation.mycomponents

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import com.alejandro_dev_links.disenioslogin.ui.theme.GrayVariant

//Empezamos ah configurar o crear nustro componente reutilizable de campo de texto
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DefaultTextField(
    modifier: Modifier,
    value: String,
    onChangedValueText: (String) -> Unit,
    label: String,
    keyboardType: KeyboardType = KeyboardType.Text,
    colors: TextFieldColors,
    icon: ImageVector,
    hideText: Boolean = false,
    maxLine: Int = 1,
    singleLine: Boolean = true
) {
    TextField(
        value = value,
        onValueChange = { onChangedValueText(it) },
        modifier = modifier,
        label = { Text(text = label) },
        keyboardOptions = KeyboardOptions(keyboardType = keyboardType),
        colors = colors,
        leadingIcon = {
            Icon(
                imageVector = icon,
                contentDescription = "Icon email",
                tint = GrayVariant
            )
        },
        visualTransformation = if (hideText) {
            PasswordVisualTransformation()
        } else {
            VisualTransformation.None
        },
        singleLine = singleLine,
        maxLines = maxLine
    )
}