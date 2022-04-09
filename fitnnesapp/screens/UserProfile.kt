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
fun UserProfile(userViewModel: UserViewModel, navController: NavController) {
    Column(Modifier.padding(50.dp)) {
        Row(Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center) {
            Text(userViewModel.userReg)
            Text(userViewModel.edadReg)
        }
        Row() {
            Column() {
                Text(text = "Peso actual: ${userViewModel.pesoReg}")
            }
            Column() {
                Text(text = "Peso deseado: ${userViewModel.pesoD}")
            }
        }
        Row(Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center) {
            if (userViewModel.pesoReg.toInt() >= userViewModel.pesoD.toInt())
                Text(
                    text = "Meta: ${userViewModel.pesoReg.toInt() - userViewModel.pesoD.toInt()} kg",
                    modifier = Modifier.padding(15.dp)
                )
            else {
                Text(
                    text = "Meta: ${(-userViewModel.pesoReg.toInt() + userViewModel.pesoD.toInt())} kg",
                    modifier = Modifier.padding(15.dp)
                )
            }
        }
        Row(
            Modifier
                .fillMaxWidth()
                .weight(1f, false),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center) {
            Button(onClick = { navController.navigate(route = AppScreens.Inicio.route)}, modifier = Modifier.size(width = 150.dp,height = 35.dp)) {
                Text(text = "Inicio")
            }
        }
    }
}