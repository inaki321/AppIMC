package mx.edu.up.fitnnesapp.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import mx.edu.up.fitnnesapp.UserViewModel


@Composable
fun FoodSelection(userViewModel: UserViewModel, navController: NavController) {   //lista de comida que tendremos en base de datos

    Column() {
        Row() {
            Text(text = "Pechuga Asada (100g) o 1 taza")

            Text(text = "164")



            Button(onClick = { userViewModel.setCalorias(164) }) {
                Text(text = "+")
            }
        }
        Row() {
            Text(text = "Arroz (100g o 1 taza)")

            Text(text = "130")


            Button(onClick = { userViewModel.setCalorias(130) }) {
                Text(text = "+")
            }

        }

        Row() {
            Text(text = "Frijoles (100g o 1 taza)")

            Text(text = "347")


            Button(onClick = { userViewModel.setCalorias(347) }) {
                Text(text = "+")
            }

        }

        Row() {
            Text(text = "Pescado (100g o 1 taza)")

            Text(text = "206")


            Button(onClick = { userViewModel.setCalorias(206) }) {
                Text(text = "+")
            }

        }

        Row() {
            Text(text = "Pasta Sola (100g o 1 taza)")

            Text(text = "131")

            Button(onClick = { userViewModel.setCalorias(131) }) {
                Text(text = "+")
            }

        }

        Row() {
            Text(text = "Proteina Isopure (1 medida o 1 scoop)")

            Text(text = "100")

            Button(onClick = { userViewModel.setCalorias(100) }) {
                Text(text = "+")
            }

        }

        Row() {
            Text(text = "Reiniciar mis calorias")

            Button(onClick = { userViewModel.resetCalorias(0) }) {
                Text(text = "Reset")
            }

        }
    }
}