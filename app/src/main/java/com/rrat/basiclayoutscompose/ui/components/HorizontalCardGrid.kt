package com.rrat.basiclayoutscompose.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rrat.basiclayoutscompose.R
import com.rrat.basiclayoutscompose.data.Character
import com.rrat.basiclayoutscompose.ui.theme.BasicLayoutsComposeTheme

@Composable
fun HorizontalCardGrid(modifier: Modifier = Modifier)
{
    val characters = listOf(
        Character(R.string.name_goku, R.drawable.goku),
        Character(R.string.name_vegeta, R.drawable.vegeta),
        Character(R.string.name_gohan, R.drawable.gohan),
        Character(R.string.name_frieza, R.drawable.frieza),
        Character(R.string.name_piccolo, R.drawable.piccolo),
        Character(R.string.name_cell, R.drawable.cell),
    )

    LazyHorizontalGrid(
        rows = GridCells.Fixed(2),
        modifier = modifier.height(120.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(horizontal = 16.dp)
    ) {
            items(characters){
                character->
                HorizontalCard(
                    drawable = character.image,
                    text = character.name)
            }
    }

}


@Preview(showBackground = true, backgroundColor = 0xFFF0EAE2)
@Composable
fun HorizontalCardGridPreview() {
    BasicLayoutsComposeTheme {
        HorizontalCardGrid()
    }
}