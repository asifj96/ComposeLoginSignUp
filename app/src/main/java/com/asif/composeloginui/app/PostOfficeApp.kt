package com.asif.composeloginui.app

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.asif.composeloginui.navigation.PostOfficeAppRouter
import com.asif.composeloginui.navigation.Screen
import com.asif.composeloginui.screens.ForgotPasswordScreen
import com.asif.composeloginui.screens.LoginScreen
import com.asif.composeloginui.screens.SignUpScreen
import com.asif.composeloginui.screens.TermsAndConditionsScreen

@Composable
fun PostOfficeApp() {

    Surface(
        modifier = Modifier.fillMaxWidth(),
        color = Color.White
    ) {

        Crossfade(targetState = PostOfficeAppRouter.currentScreen, label = "") { currentState ->
            when (currentState.value) {
                is Screen.SignUpScreen -> {
                    SignUpScreen()
                }

                is Screen.TermsAndConditionsScreen -> {
                    TermsAndConditionsScreen()
                }

                is Screen.LoginScreen -> {
                    LoginScreen()
                }

                is Screen.ForgetPasswordScreen -> {
                    ForgotPasswordScreen()
                }
            }
        }
    }
}