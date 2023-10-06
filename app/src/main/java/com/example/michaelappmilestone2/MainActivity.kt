package com.example.michaelappmilestone2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.compose.jetsurvey.signinsignup.SignInScreen
import com.example.michaelappmilestone2.ui.theme.ActivityTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ActivityTheme {
                SignInScreen()
            }
        }
    }
}