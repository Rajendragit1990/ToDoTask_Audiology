package com.rajendra.todotask_audiology

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.rememberNavController
import com.rajendra.todotask_audiology.presentation.navigation.SetupNavigation
import com.rajendra.todotask_audiology.ui.theme.ToDoTask_AudiologyTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent {
            ToDoTask_AudiologyTheme {
                val navController = rememberNavController()
                SetupNavigation(navController = navController)
            }
        }
    }
}
