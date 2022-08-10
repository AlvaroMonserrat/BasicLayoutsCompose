package com.rrat.basiclayoutscompose.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rrat.basiclayoutscompose.R
import com.rrat.basiclayoutscompose.data.Character
import com.rrat.basiclayoutscompose.ui.theme.BasicLayoutsComposeTheme


@Composable
fun CircleImageRow(modifier: Modifier = Modifier)
{
    val characters = listOf(
        Character(R.string.name_goku, R.drawable.goku),
        Character(R.string.name_vegeta, R.drawable.vegeta),
        Character(R.string.name_gohan, R.drawable.gohan),
        Character(R.string.name_frieza, R.drawable.frieza),
        Character(R.string.name_piccolo, R.drawable.piccolo),
        Character(R.string.name_cell, R.drawable.cell),
    )

    LazyRow(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(horizontal = 16.dp)
    ){
        items(items = characters){
            character->
            CircleImageItem(
                text = character.name,
                drawable = character.image,
            )
        }
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFF0EAE2)
@Composable
fun CircleImageRowPreview()
{
    BasicLayoutsComposeTheme {
        CircleImageRow()
    }
}