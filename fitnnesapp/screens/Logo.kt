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
import mx.edu.up.fitnnesapp.R
import mx.edu.up.fitnnesapp.UserViewModel
import mx.edu.up.fitnnesapp.fetchA
import mx.edu.up.fitnnesapp.navigation.AppScreens


@Composable
fun Logo(navController: NavController) {
    Column() {
        Row() {
            Image(painter = painterResource(id = R.drawable.pesaimg), contentDescription = "Logo")
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Button(onClick = {navController.navigate(route = AppScreens.InicioSesion.route)}) {
                Text(text = "Iniciar Sesion")
            }
            Button(onClick = {fetchA()}) {
                Text(text = "json")
            }
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Button(onClick = {navController.navigate(route = AppScreens.Registrar1.route)}) {
                Text(text = "Registrarse")
            }
        }

    }
}
