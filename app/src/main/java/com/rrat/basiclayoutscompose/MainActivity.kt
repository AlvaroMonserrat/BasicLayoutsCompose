package com.rrat.basiclayoutscompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.rrat.basiclayoutscompose.ui.BasicLayoutApp
import com.rrat.basiclayoutscompose.ui.BasicLayoutMainScreen
import com.rrat.basiclayoutscompose.ui.theme.BasicLayoutsComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BasicLayoutApp()
        }
    }
}
