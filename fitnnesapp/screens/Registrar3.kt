package mx.edu.up.fitnnesapp.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import mx.edu.up.fitnnesapp.screens.*

import mx.edu.up.fitnnesapp.UserViewModel
import mx.edu.up.fitnnesapp.navigation.AppScreens


@Composable
fun Registrar3(userViewModel: UserViewModel , navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {

            RegisterTextField(label = "Peso Deseado", value = userViewModel.pesoD, onValueChanged = {userViewModel.setpesoD(it)})

        }
        Row(
            Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {

            RegisterTextField(
                label = "User Name",
                value = userViewModel.userReg,
                onValueChanged = { userViewModel.setUser(it) })
        }
        Row(
            Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {

            RegisterTextField(
                label = "Password",
                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                value = userViewModel.pwd,
                onValueChanged = {userViewModel.setPassword(it)}
            )
        }



        Row(
            Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Button(onClick = { navController.navigate(route = AppScreens.Inicio.route) }, modifier = Modifier.weight(2f)) {
                Text(text = "Guardar y continuar")
            }
        }
    }
}