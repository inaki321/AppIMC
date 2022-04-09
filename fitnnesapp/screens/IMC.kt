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


@Composable
fun IMC(userViewModel: UserViewModel, navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row() {
            Text(text = "Tu IMC actual es: ${(userViewModel.pesoReg.toInt() / (userViewModel.estatura.toInt() * userViewModel.estatura.toInt()))}")

        }
        Row(modifier = Modifier
            .weight(1f, false)) {
            Text(text = "Si su IMC es menor de 18.5, se encuentra dentro del rango de peso insuficiente." +
                    " Si su IMC es entre 18.5 y 24.9, se encuentra dentro del rango de peso normal o saludable. " +
                    "Si su IMC es entre 25.0 y 29.9, se encuentra dentro del rango de sobrepeso. ")
        }

    }
}