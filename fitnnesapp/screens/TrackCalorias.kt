package mx.edu.up.fitnnesapp.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import mx.edu.up.fitnnesapp.screens.RegisterTextField
import mx.edu.up.fitnnesapp.UserViewModel
import mx.edu.up.fitnnesapp.navigation.AppScreens


@Composable
fun TrackCalorias(userViewModel: UserViewModel, navController: NavController) {

    Column(
        modifier = Modifier.fillMaxSize()) {
        Row() {
            Text(text = "Tu cuenta de calorias es: ")
            Text(text = "${userViewModel.klCalorias}")
        }
        Row() {
            LazyColumn(content = {}) //se mostrara una lista de la comida que se haya selecionado cuando se conecte con el backend
        }
        Row(modifier = Modifier
            .weight(1f, false)) {
            Button(
                onClick = {navController.navigate(route = AppScreens.FoodSelection.route)},
                modifier = Modifier.size(width = 200.dp, height = 60.dp)
            ) {
                Text(text = "Lista de comida") //Boton que manda a la pantalla de la lista de comida
            }
        }

    }
}