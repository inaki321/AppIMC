package mx.edu.up.fitnnesapp.screens

import mx.edu.up.fitnnesapp.screens.RegisterTextField
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.Checkbox
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


@Composable
fun Registrar2(userViewModel: UserViewModel , navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center) {
            mx.edu.up.fitnnesapp.RegisterTextField(
                label = "Peso (kg)",
                value = userViewModel.pesoReg,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                onValueChanged = { userViewModel.setPeso(it)})

        }
        Row(
            Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center) {
            mx.edu.up.fitnnesapp.RegisterTextField(
                label = "Estatura (cm)",
                value = userViewModel.estatura,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                onValueChanged = { userViewModel.setAltura(it)}
            )

        }
        Row(
            Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center) {
            Text(text = "Reliza actividad fisica: ")
            Checkbox(
                checked = userViewModel.ejercita,
                onCheckedChange = { userViewModel.setEjericio(it) })
        }

        Row(
            Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Button(onClick = {navController.navigate(route = AppScreens.Registrar3.route)}, modifier = Modifier.weight(2f)) {
                Text(text = "Guardar y continuar")
            }
        }
    }
}