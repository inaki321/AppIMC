package mx.edu.up.fitnnesapp.navigation

sealed class AppScreens(val route: String){
    object Logo: AppScreens("Logo")
    object InicioSesion: AppScreens("InicioSesion")
    object Inicio: AppScreens("Inicio")
    object IMC: AppScreens("IMC")
    object TrackCalorias: AppScreens("TrackCalorias")
    object FoodSelection: AppScreens("FoodSelection")
    object UserProfile: AppScreens("UserProfile")
    object Registrar1: AppScreens("Registrar1")
    object Registrar2: AppScreens("Registrar2")
    object Registrar3: AppScreens("Registrar3")
}


