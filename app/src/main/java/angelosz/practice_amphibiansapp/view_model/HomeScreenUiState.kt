package angelosz.practice_amphibiansapp.view_model

import angelosz.practice_amphibiansapp.model.Amphibian

sealed interface HomeScreenUiState {
    data class Success(
        val amphibians: List<Amphibian>
    ): HomeScreenUiState
    data object Error: HomeScreenUiState
    data object Loading: HomeScreenUiState
}