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
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import mx.edu.up.fitnnesapp.UserViewModel
import mx.edu.up.fitnnesapp.navigation.AppScreens
import mx.edu.up.fitnnesapp.screens.RegisterTextField



@Composable
fun Registrar1(userViewModel: UserViewModel , navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        mx.edu.up.fitnnesapp.RegisterTextField(
            label = "Nombre",
            value = userViewModel.nameReg,
            onValueChanged = { userViewModel.setNombre(it) })
        mx.edu.up.fitnnesapp.RegisterTextField(
            label = "Apellido",
            value = userViewModel.apellidoReg,
            onValueChanged = { userViewModel.setApellido(it) })
        mx.edu.up.fitnnesapp.RegisterTextField(
            label = "Edad",
            value = userViewModel.edadReg,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            onValueChanged = { userViewModel.setEdad(it)})
        mx.edu.up.fitnnesapp.RegisterTextField(
            label = "Genero",
            value = userViewModel.generoReg,
            onValueChanged = { userViewModel.setGenero(it) })
        Row(
            Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Button(
                onClick = {navController.navigate(route = AppScreens.Registrar2.route)},
                modifier = Modifier.weight(2f),
                enabled = userViewModel.nameReg.isNotBlank() && userViewModel.apellidoReg.isNotBlank() && userViewModel.edadReg.isNotBlank()
            ) {
                Text(text = "Guardar y continuar")
            }
        }
    }
}
