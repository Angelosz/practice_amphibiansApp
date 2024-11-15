package angelosz.practice_amphibiansapp.network

import angelosz.practice_amphibiansapp.data.AmphibianRepository
import angelosz.practice_amphibiansapp.model.Amphibian

class NetworkAmphibianRepository(
    val apiService: AmphibiansApiService
): AmphibianRepository {
    override suspend fun getAmphibianData(): List<Amphibian> = apiService.getAmphibians()
}