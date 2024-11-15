package angelosz.practice_amphibiansapp.data

import angelosz.practice_amphibiansapp.model.Amphibian

interface AmphibianRepository {
    suspend fun getAmphibianData(): List<Amphibian>
}

