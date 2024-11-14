package angelosz.practice_amphibiansapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import angelosz.practice_amphibiansapp.R
import angelosz.practice_amphibiansapp.model.Amphibian
import angelosz.practice_amphibiansapp.ui.theme.Practice_amphibiansAppTheme

@Composable
fun AmphibianDataCard(data: Amphibian, modifier: Modifier = Modifier){
    Card(modifier = modifier) {
        Column(Modifier.fillMaxWidth()){
            Text(
                text = "${data.name} (${data.type})",
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(16.dp),
            )
            Image(
                painter = painterResource(R.drawable.ic_launcher_foreground),
                contentDescription = data.name,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp),
            )
            Text(
                text = data.description,
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(12.dp),
                )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun AmphibianCardPreview(){
    Practice_amphibiansAppTheme {
        AmphibianDataCard(
            data = Amphibian(
                name = "Great Basin Spadefoot",
                type = "Toad",
                description = "This toad spends most of its life underground due to the arid desert conditions in which it lives. Spadefoot toads earn the name because of their hind legs which are wedged to aid in digging. They are typically grey, green, or brown with dark spots.",
                imgSrc = ""
            ),
            modifier = Modifier.padding(8.dp)
        )
    }
}