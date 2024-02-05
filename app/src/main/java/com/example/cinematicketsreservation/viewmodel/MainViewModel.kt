package com.example.cinematicketsreservation.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.cinematicketsreservation.viewmodel.state.MainUiState
import com.example.cinematicketsreservation.viewmodel.state.PagerUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class MainViewModel:ViewModel() {

    private val _state = MutableStateFlow(MainUiState())
    val state = _state.asStateFlow()


    init {
        getMovies()
    }

    private fun getMovies(){
        _state.update {it.copy( pager = listOf(

            PagerUiState(name = "secondImage", imageUrl ="https://th.bing.com/th/id/OIP.VQO0-gHtslZvT7sHZjjSVQHaK-?rs=1&pid=ImgDetMain"),
            PagerUiState(name = "mainImage", imageUrl ="https://mlpnk72yciwc.i.optimole.com/cqhiHLc.IIZS~2ef73/w:auto/h:auto/q:75/https://bleedingcool.com/wp-content/uploads/2022/02/FNBST3_VERT_MAIN_2764x4096_DOM_R03.jpg"),
            PagerUiState(name = "thirdImage", imageUrl ="https://th.bing.com/th/id/OIP.X7vr3yevExq2JAQ2oypiPAHaK-?w=800&h=1186&rs=1&pid=ImgDetMain"),
            )
        )
        }
    }



}