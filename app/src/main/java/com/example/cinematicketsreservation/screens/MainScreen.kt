package com.example.cinematicketsreservation.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.cinematicketsreservation.composable.BlurredImages
import com.example.cinematicketsreservation.composable.DisplayedImage
import com.example.cinematicketsreservation.viewmodel.MainViewModel
import com.example.cinematicketsreservation.viewmodel.state.MainUiState

@Composable
fun MainScreen(
    navController: NavController,
    viewModel: MainViewModel = hiltViewModel()){
    val state by  viewModel.state.collectAsState()
    MainContent(
        state = state,
        onClickPager = { navController.navigate("movieScreen" )}
    )
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun MainContent(
    state: MainUiState,
    onClickPager: ()->Unit,
){
    Column(
        modifier = Modifier
            .fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(550.dp),
            Center
        ){

            val pagerState = rememberPagerState( initialPage = 1)

            BlurredImages(state = state.pager[pagerState.currentPage].imageUrl)

            HorizontalPager(
                state = pagerState,
                pageCount = state.pager.size,
                contentPadding = PaddingValues(horizontal = 48.dp)

            ){Index->
                DisplayedImage(state = state.pager[Index], onClickPager = onClickPager)
            }
        }
    }
    }



@Preview(showBackground = true)
@Composable
fun PreviewMainScreen(){
    MainContent(state = MainUiState(), onClickPager =  {})
}