package com.rrat.basiclayoutscompose.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.rrat.basiclayoutscompose.ui.navigation.BasicBottomNavigation
import com.rrat.basiclayoutscompose.ui.theme.BasicLayoutsComposeTheme


@Composable
fun BasicLayoutApp()
{
    BasicLayoutsComposeTheme() {
        Scaffold(
            bottomBar = { BasicBottomNavigation()}
        ) {
            paddingValues ->
            BasicLayoutMainScreen(Modifier.padding(paddingValues))
        }
    }
}