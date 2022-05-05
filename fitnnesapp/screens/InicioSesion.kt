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
import mx.edu.up.fitnnesapp.screens.RegisterTextField
import mx.edu.up.fitnnesapp.UserViewModel
import mx.edu.up.fitnnesapp.navigation.AppScreens


@Composable
fun InicioSesion(userViewModel: UserViewModel, navController: NavController) {
    Column(Modifier.fillMaxSize()) {
        Image(painter = painterResource(id = R.drawable.gymlogin), contentDescription = "Login")
        Column(Modifier.padding(15.dp)) {

            RegisterTextField(
                label = "User Name",
                value = userViewModel.userReg,
                onValueChanged = { userViewModel.setUser(it) })
            RegisterTextField(
                label = "Password",
                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                value = userViewModel.pwd,
                onValueChanged = {userViewModel.setPassword(it)}
            )
            Row(
                Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Button(
                    onClick = { navController.navigate(route = AppScreens.Inicio.route)},
                    modifier = Modifier.weight(2f),
                    enabled = userViewModel.userReg.isNotBlank() && userViewModel.pwd.isNotBlank()
                ) {
                    Text(text = "Submit")
                }
            }
        }

    }
}