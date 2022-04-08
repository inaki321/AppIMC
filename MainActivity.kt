package mx.edu.up.fitnnesapp

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
import mx.edu.up.fitnnesapp.ui.theme.FitnnesappTheme

class MainActivity : ComponentActivity() {
    private val userViewModel by viewModels<UserViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FitnnesappTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    InicioSesion(userViewModel = UserViewModel())
                }
            }
        }
    }
}


@Composable
fun Logo() {
    Column() {
        Row() {
            //Image(painter = painterResource(id = R.drawable.pesaimg), contentDescription = "Logo")
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(10.dp),
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
fun InicioSesion(userViewModel: UserViewModel) {
    Column(Modifier.fillMaxSize()) {
        //Image(painter = painterResource(id = R.drawable.gymlogin), contentDescription = "Login")
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
                    onClick = { /*TODO*/ },
                    modifier = Modifier.weight(2f),
                    enabled = userViewModel.userReg.isNotBlank() && userViewModel.pwd.isNotBlank()
                ) {
                    Text(text = "Submit")
                }
            }
        }

    }
}
@Composable
fun RegisterTextField(
    label: String,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    value: String,
    onValueChanged:(String) -> Unit
) {

    OutlinedTextField(
        value = value,
        onValueChange = onValueChanged,
        label = { Text(text = label)},
        visualTransformation = visualTransformation,
        keyboardOptions = keyboardOptions,
        modifier = Modifier.padding(10.dp)
    )
}

@Composable
fun Registrar1(userViewModel: UserViewModel) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        RegisterTextField(
            label = "Nombre",
            value = userViewModel.nameReg,
            onValueChanged = { userViewModel.setNombre(it) })
        RegisterTextField(
            label = "Apellido",
            value = userViewModel.apellidoReg,
            onValueChanged = { userViewModel.setApellido(it) })
        RegisterTextField(
            label = "Edad",
            value = userViewModel.edadReg,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            onValueChanged = { userViewModel.setEdad(it)})
        RegisterTextField(
            label = "Genero",
            value = userViewModel.generoReg,
            onValueChanged = { userViewModel.setGenero(it) })
        Row(
            Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier.weight(2f),
                enabled = userViewModel.nameReg.isNotBlank() && userViewModel.apellidoReg.isNotBlank() && userViewModel.edadReg.isNotBlank()
            ) {
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
            Row() {
                OutlinedTextField(value = "Peso deseado", onValueChange = {})
            }
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
fun UserProfile(userViewModel: UserViewModel) {
    Column(Modifier.padding(50.dp)) {
        Row(Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center) {
            Text(userViewModel.userReg)
            Text(userViewModel.edadReg)
        }
        Row() {
            Column() {
                Text(text = "Peso actual: " + userViewModel.edadReg)
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
        Row(
            Modifier
                .fillMaxWidth()
                .weight(1f, false),
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
    FitnnesappTheme {
        InicioSesion(userViewModel = UserViewModel())
    }
}