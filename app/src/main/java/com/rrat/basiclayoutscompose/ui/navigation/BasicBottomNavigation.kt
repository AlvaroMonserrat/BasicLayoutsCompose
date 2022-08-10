package com.rrat.basiclayoutscompose.ui.navigation

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun BasicBottomNavigation(
    modifier: Modifier = Modifier
)
{
    BottomNavigation(
        modifier = modifier,
        backgroundColor = MaterialTheme.colors.background
    ) {
        BottomNavigationItem(
            icon = {
                Icon(imageVector = Icons.Default.Home, contentDescription = null)
                   },
            selected = true,
            onClick = { /*TODO*/ },
            label = {
                Text("Home")
            }
        )
        BottomNavigationItem(
            icon = {
                Icon(imageVector = Icons.Default.AccountCircle, contentDescription = null)
            },
            selected = false,
            onClick = { /*TODO*/ },
            label = {
                Text("Account")
            }
        )
    }
}

@Preview
@Composable
fun BasicBottomNavigationPreview()
{
    BasicBottomNavigation()
}
