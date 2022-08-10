package com.rrat.basiclayoutscompose.ui.sections

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rrat.basiclayoutscompose.R
import com.rrat.basiclayoutscompose.ui.BasicLayoutMainScreen
import com.rrat.basiclayoutscompose.ui.components.CircleImageRow
import com.rrat.basiclayoutscompose.ui.theme.BasicLayoutsComposeTheme
import java.util.*

@Composable
fun HomeSection(
    @StringRes title: Int,
    modifier: Modifier = Modifier,
    content: @Composable ()->Unit
)
{
    Column(modifier = modifier) {
        Text(
            text = stringResource(id = title).uppercase(Locale.getDefault()),
            modifier = Modifier
                .paddingFromBaseline(top = 56.dp, bottom = 8.dp)
                .padding(horizontal = 16.dp),
            style = MaterialTheme.typography.h5
            ,
            )
        content()
    }
}

@Preview
@Composable
fun HomeSectionPreview()
{
    BasicLayoutsComposeTheme {
        HomeSection(R.string.home){
            CircleImageRow()
        }
    }
}
