package angelosz.practice_amphibiansapp.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import angelosz.practice_amphibiansapp.model.Amphibian
import angelosz.practice_amphibiansapp.ui.theme.Practice_amphibiansAppTheme

@Composable
fun HomeScreen(amphibianList: List<Amphibian>, modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier) {
        items(items = amphibianList){ amphibian ->
            AmphibianDataCard(amphibian, Modifier.padding(24.dp))
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreenPreview(){
    Practice_amphibiansAppTheme {
        val amphibianList = listOf(
            Amphibian(
                name = "Great Basin Spadefoot",
                type = "Toad",
                description = "This toad spends most of its life underground due to the arid desert conditions in which it lives. Spadefoot toads earn the name because of their hind legs which are wedged to aid in digging. They are typically grey, green, or brown with dark spots.",
                imgSrc = "https://developer.android.com/codelabs/basic-android-kotlin-compose-amphibians-app/img/great-basin-spadefoot.png"
            ),
            Amphibian(
                name = "Great Basin Spadefoot",
                type = "Toad",
                description = "This toad spends most of its life underground due to the arid desert conditions in which it lives. Spadefoot toads earn the name because of their hind legs which are wedged to aid in digging. They are typically grey, green, or brown with dark spots.",
                imgSrc = "https://developer.android.com/codelabs/basic-android-kotlin-compose-amphibians-app/img/great-basin-spadefoot.png"
            ),
            Amphibian(
                name = "Great Basin Spadefoot",
                type = "Toad",
                description = "This toad spends most of its life underground due to the arid desert conditions in which it lives. Spadefoot toads earn the name because of their hind legs which are wedged to aid in digging. They are typically grey, green, or brown with dark spots.",
                imgSrc = "https://developer.android.com/codelabs/basic-android-kotlin-compose-amphibians-app/img/great-basin-spadefoot.png"
            ),
            Amphibian(
                name = "Great Basin Spadefoot",
                type = "Toad",
                description = "This toad spends most of its life underground due to the arid desert conditions in which it lives. Spadefoot toads earn the name because of their hind legs which are wedged to aid in digging. They are typically grey, green, or brown with dark spots.",
                imgSrc = "https://developer.android.com/codelabs/basic-android-kotlin-compose-amphibians-app/img/great-basin-spadefoot.png"
            )
        )
        HomeScreen(amphibianList)
    }
}