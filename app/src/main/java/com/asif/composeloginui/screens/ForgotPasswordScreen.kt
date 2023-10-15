package com.asif.composeloginui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.asif.composeloginui.R
import com.asif.composeloginui.components.ButtonComponent
import com.asif.composeloginui.components.HeadingTextComponent
import com.asif.composeloginui.components.MyPasswordTextFieldComponent
import com.asif.composeloginui.navigation.PostOfficeAppRouter
import com.asif.composeloginui.navigation.Screen
import com.asif.composeloginui.navigation.SystemBackButtonHandler

@Composable
fun ForgotPasswordScreen() {

    val scrollState = rememberScrollState()

    Surface(
        color = Color.White,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(20.dp)
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(state = scrollState)
        ) {
            HeadingTextComponent(value = stringResource(id = R.string.title_forget_password))
            Spacer(modifier = Modifier.height(40.dp))
            MyPasswordTextFieldComponent(
                labelValue = stringResource(id = R.string.password),
                painterResource = painterResource(id = R.drawable.ic_password_icon)
            )
            Spacer(modifier = Modifier.height(40.dp))
            ButtonComponent(value = stringResource(id = R.string.forget))
        }
    }

    SystemBackButtonHandler {
        PostOfficeAppRouter.navigateTo(Screen.LoginScreen)
    }
}

@Preview
@Composable
fun DefaultPreviewOfForgotPasswordScreen() {
    ForgotPasswordScreen()
}