package com.example.cinematicketsreservation.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.example.cinematicketsreservation.viewmodel.state.PagerUiState

@Composable
fun BlurredImages(
    state: String,
    modifier: Modifier = Modifier){
        Box(
            modifier = modifier
                .fillMaxWidth()
                .height(550.dp)
                .blur(10.dp),

            )
        {
            Image(
                painter = rememberAsyncImagePainter(model = state),
                contentDescription = "Image with Gradient",
                modifier = Modifier
                    .matchParentSize(),
                contentScale = ContentScale.Crop

            )
            Box(
                modifier = Modifier
                    .matchParentSize()
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(Color.Transparent, Color.White),
                            startY =  0.5f,
                            endY = Float.POSITIVE_INFINITY
                        )
                    )
            )
        }

    }
