package angelosz.practice_amphibiansapp

import android.app.Application
import angelosz.practice_amphibiansapp.data.AppContainer
import angelosz.practice_amphibiansapp.data.DefaultAppContainer

class AmphibianApplication: Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}