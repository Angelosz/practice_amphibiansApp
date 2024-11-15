package angelosz.practice_amphibiansapp.data

import angelosz.practice_amphibiansapp.network.AmphibiansApiService
import angelosz.practice_amphibiansapp.network.NetworkAmphibianRepository
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit

interface AppContainer {
    val amphibianRepository: AmphibianRepository
}

class DefaultAppContainer: AppContainer {
    private val baseUrl = "https://android-kotlin-fun-mars-server.appspot.com"

    private val retrofit: Retrofit = Retrofit
        .Builder()
        .addConverterFactory(Json.asConverterFactory("application/json".toMediaType()))
        .baseUrl(baseUrl)
        .build()

    private val amphibiansApiService: AmphibiansApiService by lazy {
        retrofit.create(AmphibiansApiService::class.java)

    }

    override val amphibianRepository: AmphibianRepository by lazy {
        NetworkAmphibianRepository(amphibiansApiService)
    }
}