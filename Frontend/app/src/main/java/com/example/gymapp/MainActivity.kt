package com.example.gymapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.ViewModels.BodyPartsViewModel
import com.example.compose.AppTheme
import com.example.gymapp.Views.AboutAppContent
import com.example.gymapp.Views.AboutUsContent
import com.example.gymapp.Data.Routes
import com.example.gymapp.Views.BodyPartsContent
import com.example.gymapp.Views.SettingsContent


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppTheme {
                val navController = rememberNavController()
                val viewModel: BodyPartsViewModel by viewModels()

                NavHost(navController = navController, startDestination = Routes.Principal.route) {
                    composable(Routes.Principal.route) { Principal(navController) }
                    composable(Routes.AboutUs.route) { AboutUsContent(navController) }
                    composable(Routes.AboutApp.route) { AboutAppContent(navController) }
                    composable(Routes.Settings.route) { SettingsContent(navController) }
                    composable(Routes.BodyPartsScreen.route) { BodyPartsContent(navController, viewModel) }

                }
            }
        }
    }

}




