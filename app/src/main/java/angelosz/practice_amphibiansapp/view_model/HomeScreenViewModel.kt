package angelosz.practice_amphibiansapp.view_model

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import angelosz.practice_amphibiansapp.AmphibianApplication
import angelosz.practice_amphibiansapp.data.AmphibianRepository
import kotlinx.coroutines.launch
import retrofit2.HttpException
import java.io.IOException


class HomeScreenViewModel(
    private val amphibianRepository: AmphibianRepository
): ViewModel() {
    var uiState: HomeScreenUiState by mutableStateOf(HomeScreenUiState.Loading)
        private set

    init {
        getAmphibiansData()
    }

    private fun getAmphibiansData(){
        viewModelScope.launch{
            uiState = HomeScreenUiState.Loading
            uiState = try{
                val data = amphibianRepository.getAmphibianData()
                HomeScreenUiState.Success(data)
            } catch (e: IOException){
                HomeScreenUiState.Error
            } catch (e: HttpException){
                HomeScreenUiState.Error
            }
        }
    }

    companion object {
        val Factory: ViewModelProvider.Factory = viewModelFactory {
            initializer {
                val application = (this[APPLICATION_KEY] as AmphibianApplication)
                val repository = application.container.amphibianRepository
                HomeScreenViewModel(amphibianRepository = repository)
            }
        }
    }
}