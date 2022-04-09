package mx.edu.up.fitnnesapp

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class UserViewModel:ViewModel() {
    var userReg by mutableStateOf("")
    var pwd by mutableStateOf("")
    var nameReg by mutableStateOf("")
    var apellidoReg by mutableStateOf("")
    var edadReg by mutableStateOf("")
    var generoReg by mutableStateOf("")
    var pesoReg by mutableStateOf("")
    var estatura by mutableStateOf("")
    var ejercita by mutableStateOf(false)
    var pesoD by mutableStateOf("")
    var klCalorias by mutableStateOf(0)

    fun setUser(newUser: String){
        userReg = newUser
    }

    fun setPassword(newPwd: String){
        pwd = newPwd
    }

    fun setNombre(newName:String){
        nameReg = newName
    }
    fun setApellido(newApellido:String){
        apellidoReg = newApellido
    }
    fun setEdad(newAge:String){
        edadReg = newAge
    }
    fun setGenero(newGen:String){
        generoReg = newGen
    }
    fun setPeso(newPeso:String){
        pesoReg = newPeso
    }
    fun setAltura(newAltura:String){
        estatura = newAltura
    }
    fun setEjericio(newEjercicio:Boolean){
        ejercita = newEjercicio
    }
    fun setpesoD(newPesoD:String){
        pesoD = newPesoD
    }
    fun setCalorias(newCaloria:Int){
        klCalorias += newCaloria
    }
    fun resetCalorias(reset:Int){
        klCalorias = 0
    }
}