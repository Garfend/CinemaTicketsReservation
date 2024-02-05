package com.example.cinematicketsreservation.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.example.cinematicketsreservation.viewmodel.MovieViewModel

@Composable
fun MovieScreen(
    navController: NavController,
    viewModel: MovieViewModel = hiltViewModel()) {
    MovieContent()

}

@Composable
fun MovieContent() {
}


@Preview(showBackground = true)
@Composable
fun PreviewMovieScreen(){
    MovieContent()
}
