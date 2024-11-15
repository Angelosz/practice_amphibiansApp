package angelosz.practice_amphibiansapp

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import angelosz.practice_amphibiansapp.ui.HomeScreen
import angelosz.practice_amphibiansapp.view_model.HomeScreenViewModel

@Composable
fun AmphibianApp(){
    Scaffold(
        topBar = { AmphibianAppTopBar() }
    ){ innerPadding ->
        Surface(modifier = Modifier.padding(innerPadding)){
            val viewModel: HomeScreenViewModel = viewModel(factory = HomeScreenViewModel.Factory)
            HomeScreen(viewModel.uiState)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AmphibianAppTopBar(){
    TopAppBar(
        title = {
            Text(
                text = "Amphibians",
                modifier = Modifier.padding(16.dp)
            )
        }
    )
}