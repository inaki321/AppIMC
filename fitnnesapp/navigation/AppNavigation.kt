package mx.edu.up.fitnnesapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.ShaderBrush
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import mx.edu.up.fitnnesapp.navigation.AppScreens
import mx.edu.up.fitnnesapp.screens.*
import mx.edu.up.fitnnesapp.UserViewModel


@Composable
fun AppNavigation(userViewModel: UserViewModel){
    val userVM = userViewModel
    val navController = rememberNavController()
    NavHost(navController= navController, startDestination = AppScreens.Logo.route){
        composable(AppScreens.Inicio.route){
            Inicio(navController)
        }
        composable(AppScreens.FoodSelection.route){
            FoodSelection(userVM, navController)
        }
        composable(AppScreens.IMC.route){
            IMC(userVM, navController)
        }
        composable(AppScreens.InicioSesion.route){
            InicioSesion(userVM, navController)
        }
        composable(AppScreens.Logo.route){
            Logo(navController)
        }
        composable(AppScreens.TrackCalorias.route){
            TrackCalorias(userVM, navController)
        }
        composable(AppScreens.UserProfile.route){
            UserProfile(userVM, navController)
        }
        composable(AppScreens.Registrar1.route){
            Registrar1(userVM, navController)
        }
        composable(AppScreens.Registrar2.route){
            Registrar2(userVM, navController)
        }
        composable(AppScreens.Registrar3.route){
            Registrar3(userVM, navController)
        }
    }
}