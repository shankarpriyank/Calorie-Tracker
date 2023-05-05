package com.priyank.calorietracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.priyank.calorietracker.navigation.cnavigate
import com.priyank.calorietracker.ui.theme.CalorieTrackerTheme
import com.priyank.core.navigation.Route
import com.priyank.onboarding_presentation.activity.ActivityScreen
import com.priyank.onboarding_presentation.age.AgeScreen
import com.priyank.onboarding_presentation.gender.GenderScreen
import com.priyank.onboarding_presentation.goal.GoalScreen
import com.priyank.onboarding_presentation.height.HeightScreen
import com.priyank.onboarding_presentation.weight.WeightScreen
import com.priyank.onboarding_presentation.welcome.WelcomeScreen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalorieTrackerTheme {
                val scaffoldState = rememberScaffoldState()
                val navController = rememberNavController()

                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    scaffoldState = rememberScaffoldState()
                ) {

                    NavHost(
                        modifier = Modifier.padding(it),
                        navController = navController,
                        startDestination = Route.WELCOME
                    ) {
                        composable(Route.WELCOME) {
                            WelcomeScreen(onNavigate = navController::cnavigate)
                        }
                        composable(Route.AGE) {
                            AgeScreen(
                                scaffoldState = scaffoldState,
                                onNavigate = navController::cnavigate
                            )
                        }
                        composable(Route.GENDER) {
                            GenderScreen(onNavigate = navController::cnavigate)
                        }
                        composable(Route.HEIGHT) {
                            HeightScreen(
                                scaffoldState = scaffoldState,
                                onNavigate = navController::cnavigate
                            )
                        }
                        composable(Route.WEIGHT) {
                            WeightScreen(
                                scaffoldState = scaffoldState,
                                onNavigate = navController::cnavigate
                            )
                        }
                        composable(Route.NUTRIENT_GOAL) {
                        }
                        composable(Route.ACTIVITY) {
                            ActivityScreen(onNavigate = navController::cnavigate)

                        }
                        composable(Route.GOAL) {
                            GoalScreen(onNavigate = navController::cnavigate)

                        }

                        composable(Route.TRACKER_OVERVIEW) {
                        }
                        composable(Route.SEARCH) {
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CalorieTrackerTheme {
        Greeting("Android")
    }
}
