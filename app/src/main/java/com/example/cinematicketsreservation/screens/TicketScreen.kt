package com.example.cinematicketsreservation.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.example.cinematicketsreservation.viewmodel.TicketViewModel


@Composable
fun TicketScreen(
    navController: NavController,
    viewModel: TicketViewModel = hiltViewModel()) {
    TicketContent()

}

@Composable
fun TicketContent() {

}

@Preview(showBackground = true)
@Composable
fun PreviewTicketScreen() {
    TicketContent()
}
