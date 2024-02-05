package com.example.cinematicketsreservation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.cinematicketsreservation.screens.MainScreen
import com.example.cinematicketsreservation.screens.MovieScreen
import com.example.cinematicketsreservation.screens.TicketScreen
import com.example.cinematicketsreservation.ui.theme.CinemaTicketsReservationTheme

@Composable
fun CinemaNavGraph(navController: NavHostController){
    NavHost(navController = navController, startDestination = "mainScreen"){
        composable("mainScreen"){ MainScreen(navController)}
        composable("movieScreen"){ MovieScreen(navController) }
        composable("ticketScreen"){ TicketScreen(navController) }


    }
}