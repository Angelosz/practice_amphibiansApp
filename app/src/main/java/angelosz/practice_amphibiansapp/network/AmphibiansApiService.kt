package angelosz.practice_amphibiansapp.network

import angelosz.practice_amphibiansapp.model.Amphibian
import retrofit2.http.GET

interface AmphibiansApiService {
    @GET("amphibians")
    suspend fun getAmphibians(): List<Amphibian>
}