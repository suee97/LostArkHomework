package com.example.lostarkcheckcompose

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.lostarkcheckcompose.data.SharedViewModel
import com.example.lostarkcheckcompose.data.models.Job
import com.example.lostarkcheckcompose.ui.screens.home.HomeScreen
import com.example.lostarkcheckcompose.ui.theme.LostArkCheckComposeTheme
import com.example.lostarkcheckcompose.utils.Constants.HOME_SCREEN_ROUTE
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

//    private lateinit var navController: NavHostController
    private val sharedViewModel: SharedViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LostArkCheckComposeTheme {
                var job by sharedViewModel.curJob

                Column() {
                    Text(text = job.jobName)
                    Button(onClick = {
                        job = Job.BLADE
                    }) {
                        Text(text = "Change")
                    }
                }

//                navController = rememberNavController()
//                NavHost(
//                    navController = navController,
//                    startDestination = HOME_SCREEN_ROUTE
//                ) {
//                    composable(HOME_SCREEN_ROUTE) {
//                        HomeScreen()
//                    }
//                }
            }
        }
    }
}
