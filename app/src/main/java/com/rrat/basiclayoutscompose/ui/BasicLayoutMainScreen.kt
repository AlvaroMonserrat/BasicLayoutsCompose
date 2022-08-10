package com.rrat.basiclayoutscompose.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rrat.basiclayoutscompose.R
import com.rrat.basiclayoutscompose.ui.components.CircleImageRow
import com.rrat.basiclayoutscompose.ui.components.HorizontalCardGrid
import com.rrat.basiclayoutscompose.ui.components.SearchBar
import com.rrat.basiclayoutscompose.ui.navigation.BasicBottomNavigation
import com.rrat.basiclayoutscompose.ui.sections.HomeSection
import com.rrat.basiclayoutscompose.ui.theme.BasicLayoutsComposeTheme

@Composable
fun BasicLayoutMainScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier= modifier
            .verticalScroll(rememberScrollState())
            .padding(vertical = 16.dp)
    ) {
        Spacer(Modifier.height(16.dp))
        SearchBar(Modifier.padding(horizontal = 16.dp))
        HomeSection(R.string.home){
            CircleImageRow()
        }
        HomeSection(title = R.string.favorite) {
            HorizontalCardGrid()
        }
        Spacer(Modifier.height(16.dp))
    }

}

@Preview
@Composable
fun BasicLayoutMainScreenPreview()
{
    BasicLayoutsComposeTheme {
        BasicLayoutMainScreen()
    }
}
