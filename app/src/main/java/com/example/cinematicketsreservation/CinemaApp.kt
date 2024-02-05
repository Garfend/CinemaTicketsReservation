package com.example.cinematicketsreservation

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.cinematicketsreservation.ui.theme.CinemaTicketsReservationTheme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CinemaApp() {
    CinemaTicketsReservationTheme {
        Scaffold {
            val navController = rememberNavController()
            CinemaNavGraph(navController = navController)
        }
    }


}