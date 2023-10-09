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
import com.asif.composeloginui.components.CheckboxComponent
import com.asif.composeloginui.components.ClickableLoginTextComponent
import com.asif.composeloginui.components.DividerTextComponent
import com.asif.composeloginui.components.HeadingTextComponent
import com.asif.composeloginui.components.MyPasswordTextFieldComponent
import com.asif.composeloginui.components.MyTextFiledComponent
import com.asif.composeloginui.components.NormalTextComponent
import com.asif.composeloginui.navigation.PostOfficeAppRouter
import com.asif.composeloginui.navigation.Screen

@Composable
fun SignUpScreen() {

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
            NormalTextComponent(value = stringResource(id = R.string.hello))
            HeadingTextComponent(value = stringResource(id = R.string.create_account))
            Spacer(modifier = Modifier.height(10.dp))
            MyTextFiledComponent(
                labelValue = stringResource(id = R.string.first_name),
                painterResource(id = R.drawable.ic_profile_icon)
            )
            MyTextFiledComponent(
                labelValue = stringResource(id = R.string.last_name),
                painterResource = painterResource(id = R.drawable.ic_profile_icon)
            )
            MyTextFiledComponent(
                labelValue = stringResource(id = R.string.email),
                painterResource = painterResource(id = R.drawable.ic_email_icon)
            )
            MyPasswordTextFieldComponent(
                labelValue = stringResource(id = R.string.password),
                painterResource = painterResource(id = R.drawable.ic_password_icon)
            )

            CheckboxComponent(value = stringResource(id = R.string.terms_and_condition),
                onTextSelected = {
                    PostOfficeAppRouter.navigateTo(Screen.TermsAndConditionsScreen)
                })

            Spacer(modifier = Modifier.height(40.dp))

            ButtonComponent(value = stringResource(id = R.string.register))

            Spacer(modifier = Modifier.height(20.dp))

            DividerTextComponent()

            ClickableLoginTextComponent(tryingToLogin = true, onTextSelected = {
//                PostOfficeAppRouter.navigateTo(Screen.LoginScreen)
            })
        }
    }
}

@Preview
@Composable
fun DefaultPreviewOfSignUpScreen() {
    SignUpScreen()
}