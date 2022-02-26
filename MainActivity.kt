package mx.edu.up.proyecto

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import mx.edu.up.proyecto.ui.theme.ProyectoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProyectoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    InicioSesion()
                }
            }
        }
    }
}

@Composable
fun Logo() {
    Column() {
        Row() {
            Image(painter = painterResource(id = R.drawable.pesaimg), contentDescription = "Logo")
        }
        Row(
            Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Iniciar Sesion")
            }
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Registrarse")
            }
        }

    }
}

@Composable
fun InicioSesion() {
    Column(Modifier.fillMaxSize()) {
        Image(painter = painterResource(id = R.drawable.gymlogin), contentDescription = "Login")

        Column(Modifier.padding(15.dp)) {
            OutlinedTextField(value = "User", onValueChange = {})
            OutlinedTextField(value = "Password", onValueChange = {})
            Row(
                Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Button(onClick = { /*TODO*/ }, modifier = Modifier.weight(2f)) {
                    Text(text = "Submit")
                }
            }
        }

    }
}

@Composable
fun Registrar1() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(value = "Nombre", onValueChange = {}, modifier = Modifier.padding(10.dp))
        OutlinedTextField(
            value = "Apellido",
            onValueChange = {},
            modifier = Modifier.padding(10.dp)
        )
        OutlinedTextField(value = "Edad", onValueChange = {}, modifier = Modifier.padding(10.dp))
        OutlinedTextField(value = "Sexo", onValueChange = {}, modifier = Modifier.padding(10.dp))
        Row(
            Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Button(onClick = { /*TODO*/ }, modifier = Modifier.weight(2f)) {
                Text(text = "Guardar y continuar")
            }
        }
    }
}

@Composable
fun Registrar2() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row() {

            OutlinedTextField(value = "Peso (kg)", onValueChange = {})
        }
        Row() {
            OutlinedTextField(value = "Estatura (cm)", onValueChange = {})
        }
        Row() {
            Text(text = "Reliza actividad fisica: ")
            Checkbox(checked = false, onCheckedChange = {})
        }
        Row(
            Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Button(onClick = { /*TODO*/ }, modifier = Modifier.weight(2f)) {
                Text(text = "Guardar y continuar")
            }
        }
    }
}

@Composable
fun Registrar3() {
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
            Column() {
                Text(text = "Bajar de Peso")
                Checkbox(checked = false, onCheckedChange = {})
            }
            Column() {
                Text(text = "Mantener de Peso")
                Checkbox(checked = false, onCheckedChange = {})
            }
            Column() {
                Text(text = "Subir de Peso")
                Checkbox(checked = false, onCheckedChange = {})
            }
        }
        Row() {
            OutlinedTextField(value = "Peso deseado", onValueChange = {})
        }

        Row(
            Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Button(onClick = { /*TODO*/ }, modifier = Modifier.weight(2f)) {
                Text(text = "Guardar y continuar")
            }
        }
    }
}

@Composable
fun Inicio() {
    Column() {

        Row(
            Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Button(onClick = {}, modifier = Modifier.size(width = 200.dp, height = 60.dp)) {
                Text(text = "Perfil")
            }
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier.size(width = 200.dp, height = 60.dp)
            ) {
                Text(text = "Cuenta de Calorias")
            }
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier.size(width = 200.dp, height = 60.dp)
            ) {
                Text(text = "IMC")
            }
        }

    }
}

@Composable
fun IMC() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row() {
            Text(text = "Tu IMC actual es: ")
            Text(text = "placeholderIMC")
        }
        Row(modifier = Modifier
            .weight(1f, false)) {
            Text(text = "Si su IMC es menor de 18.5, se encuentra dentro del rango de peso insuficiente." +
                    " Si su IMC es entre 18.5 y 24.9, se encuentra dentro del rango de peso normal o saludable. " +
                    "Si su IMC es entre 25.0 y 29.9, se encuentra dentro del rango de sobrepeso. ")
        }

    }
}

@Composable
fun TrackCalorias() {
    Column(
        modifier = Modifier.fillMaxSize()) {
        Row() {
            Text(text = "Tu cuenta de calorias es: ")
            Text(text = "placeholderCAL")
        }
        Row() {
            LazyColumn(content = {}) //se mostrara una lista de la comida
        }
        Row(modifier = Modifier
            .weight(1f, false)) {
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier.size(width = 200.dp, height = 60.dp)
            ) {
                Text(text = "Lista de comida") //Boton que manda a la pantalla de la lista de comida
            }
        }

    }
}

@Composable
fun FoodSelection() {   //lista de comida que tendremos en base de datos
    Row() {
        //Image(painter = painterResource(id = R.drawable.gato ), contentDescription ="comida" )
        Text(text = "Comida")
        Text(text = "Calorias")
        Button(onClick = { /*TODO*/ }) {
            Text(text = "+")
        }
    }
}

@Composable
fun UserProfile() {
    Column(Modifier.padding(50.dp)) {
        Row(Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center) {
            Text(text = "Nombre, edad")
        }
        Row() {
            Column() {
                Text(text = "Peso actual: peso")
            }
            Column() {
                Text(text = "Peso deseado: pesoD")
            }
        }
        Row(Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center) {
            Text(text = "Progreso: abs(peso-pesod)")
        }
        Row(Modifier.fillMaxWidth().weight(1f, false),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center) {
            Button(onClick = { /*TODO*/ }, modifier = Modifier.size(width = 150.dp,height = 35.dp)) {
                Text(text = "Inicio")
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ProyectoTheme {
        Logo()
    }
}