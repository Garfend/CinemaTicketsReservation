package com.example.cinematicketsreservation.composable

import androidx.annotation.FloatRange
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.lerp
import com.example.cinematicketsreservation.viewmodel.state.MainUiState
import kotlin.math.absoluteValue


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PagerWithEffect(states: MainUiState,
onClickPager: ()->Unit) {
    val pagerState = rememberPagerState()
    HorizontalPager(
        state = pagerState,
        pageCount = states.pager.size) { page ->
        Card(
            Modifier
                .size(200.dp)
                .graphicsLayer {
                    // Calculate the absolute offset for the current page from the
                    // scroll position. We use the absolute value which allows us to mirror
                    // any effects for both directions
                    val pageOffset = (
                            (pagerState.currentPage - page) + pagerState
                                .currentPageOffsetFraction
                            ).absoluteValue

                    // We animate the alpha, between 50% and 100%

//                    alpha = lerp(
//                        start = Color.Black,
//                        stop = Color.Blue,
//                        fraction = FloatRange(0.0,1.0 - pageOffset.coerceIn(0.0f, 1.0f)))
                }
        ) {
            DisplayedImage(state = states.pager[page], onClickPager = onClickPager)
        }
    }
}