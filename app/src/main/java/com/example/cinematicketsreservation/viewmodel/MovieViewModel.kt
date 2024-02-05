package com.example.cinematicketsreservation.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class MovieViewModel: ViewModel() {
    private val _state = MutableStateFlow(0)
    val state = _state.asStateFlow()
}
