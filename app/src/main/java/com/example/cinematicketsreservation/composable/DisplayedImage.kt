package com.example.cinematicketsreservation.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.example.cinematicketsreservation.R
import com.example.cinematicketsreservation.viewmodel.state.PagerUiState

@Composable
fun DisplayedImage(
    state: PagerUiState,
        onClickPager: ()-> Unit,
){
    Card(
        shape = RoundedCornerShape(20.dp),
    )
    { Image(
        painter = rememberAsyncImagePainter(model = state.imageUrl),
        contentDescription = "Image with Gradient",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .width(260.dp)
            .height(360.dp)
            .clickable {  onClickPager },
        )}

}